package com.guigu.audition.two.volatil;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 证明volatile的可见性
 */
class MyData2{

    volatile  int number = 0;

    public void addT060(){
        this.number = 60;
    }

    //请注意，此时number前面是加了volatile关键字修饰的，volatile不保证原子性
    public  void addPlusPlus(){
        /**
         * 自增++时，在多线程中地不安全的
         */
        number++;//number++ 分为三步 首先获取number的原值，然后进行+1 ，接着在把加1的值赋值回去
    }

    AtomicInteger atomicInteger = new AtomicInteger();
    public void addAtomic(){
        atomicInteger.getAndIncrement();
    }


}

/**
 *volatile是java虚拟机提供的轻量级的同步机制，三种特性
 *   1.可见性
 *   2.不保证原子性
 *   3.禁止
 *
 *  验证Volatile的可见性
 *     1.1 假如int number = 0；number变量之前根本没有添加volatile关键字修饰,没有可见性
 *     1.2 添加了volatile，可以解决可见性问题
 *
 *
 * 2. 验证volatile不保证原子性
 *    2.1 原子性指得什么意思？
 *      不可分割，完整性，也即某个线程正在做某个具体业务时，中间可以被加塞或者被分割。需要整体完整。
 *      要么同时成功，要么同时失败。
 *
 *    2.2 volatile不保证原子性的案例演示：
 *
 *    2.3 why
 *      //number++ 分为三步 首先获取number的原值，然后进行+1 ，接着在把加1的值赋值回去
 *
 *    2.4 如何解决原子性
 *        *加sync 但是使用synchronized消耗资源太大
 *        *所以使用juc下的AtomicInteger
 *
 */
public class VolatileDemo2 {

    public static void main(String[] args) {

        MyData2 myData2 = new MyData2();

        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 1; j <= 1000; j++) {
                    myData2.addPlusPlus();
                    myData2.addAtomic();
                }
            },String.valueOf(i)).start();
        }
        //需要等待上面20个线程都全部计算完成后，再用main线程取得最终的结果值看是多少？
        while(Thread.activeCount() > 2){//多线程控制上面线程计算时间的方法
            //至于为什么是2，后台默认是两个线程，一个是main线程，一个是GC线程
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + "\t int type, finally number value: " + myData2.number);
        System.out.println(Thread.currentThread().getName() + "\t AtomicInteger type, finally number value: " + myData2.atomicInteger);
//        try{TimeUnit.SECONDS.sleep(5);}catch (InterruptedException e){e.printStackTrace();}

    }

    //volatile 可以保证可见性，及时通知其它线程，主物理内存的值已经被修改
    public static void seeOkVolatile(){
        MyData2 myData = new MyData2();//资源类
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "\t come in");
            //暂停一会儿线程
            try{
                TimeUnit.SECONDS.sleep(3);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

            myData.addT060();
            System.out.println(Thread.currentThread().getName() + "\t update number value: " + myData.number);

        },"AAA").start();

        //第二个线程就是我们的main线程
        while(myData.number == 0){
            //main线程就一直再这里等待循环，直到number值不再等于零
        }

        System.out.println(Thread.currentThread().getName() + "\t mission is over，main get number value:" + myData.number);

    }

}
