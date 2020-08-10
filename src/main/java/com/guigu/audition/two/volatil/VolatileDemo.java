package com.guigu.audition.two.volatil;

import java.util.concurrent.TimeUnit;

/**
 * 证明volatile的可见性
 */
class MyData{

    volatile  int number = 0;
//      int number = 0;

    public void addT060(){
        this.number = 60;
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
 */
public class VolatileDemo {

    public static void main(String[] args) {
        MyData myData = new MyData();//资源类
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
