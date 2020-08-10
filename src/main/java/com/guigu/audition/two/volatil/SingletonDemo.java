package com.guigu.audition.two.volatil;

/**
 * 单例模式多线程环境下可能存在的安全问题
 */
public class SingletonDemo {

    private static SingletonDemo instance = null; //不增加volatile,在创建对象的时候会进行指令重排
    //增加volatile才是最终的在多线程环境下的双端检索机制
//    private static volatile SingletonDemo instance = null;

    private SingletonDemo(){
        System.out.println(Thread.currentThread().getName() + "\t 我是构造方法singletonDemo()");
    }

//    public static SingletonDemo getInstance(){//单线程模式下，单例创建模式
    //尽量不使用synchronized同步方法，因为消耗资源太重，把整个方法都锁起来了
//    public static synchronized SingletonDemo getInstance(){//多线程模式下单例创建模式,增加synchronized保证执行顺序

    /**
     * 使用DCL（Double Check Lock 双端检索机制）
     * 双端检索机制，即在加锁前和加锁后进行判断
     * @return
     */
    public static  SingletonDemo getInstance(){
        if(instance == null){
           try{
               Thread.sleep(200);

           }catch (Exception e){

           }

            synchronized (SingletonDemo.class){
                try{
                    Thread.sleep(500);

                }catch (Exception e){

                }

                if(instance == null){
                    /**
                     * 但是在初始化对象的过程中可能会发生指令重排
                     * 1.先分配对象内存空间
                     * 2.初始化对象
                     * 3.设置instance指向刚分配的内存地址，此时instance != null 初始化完成
                     *
                     * 但是步骤2和步骤3不存在数据依赖关系，而且无论重排前还是重排后程序的执行结果在单线程中并没有改变
                     * 所以这种重排优化是允许的
                     * 但是若果先执行步骤3在执行步骤2，先给instance复制，但是内存地址所指向的value值为空
                     * 所以当一条线程访问instance不为null时,由于instance实例未必完成初始化,也就造成了线程安全问题.
                     * 所以应该为instance对象增加volatile，禁止指令重排
                     */
                    instance = new SingletonDemo();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        /*//单线程（main线程的操作）
        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
        System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
*/
        //并发多线程后，情况发生了很大的变化 这时多个线程都会创建对象
        for(int i = 1; i<=100;i++){
            new Thread(() -> {
                SingletonDemo.getInstance();
            },String.valueOf(i)).start();
        }
    }

}
