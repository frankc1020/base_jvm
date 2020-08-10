package com.guigu.se.j2se.single;

/**
 * 懒汉式：
 *
 *
 *    线程安全的（适用于多线程）
 *
 * （1）构造器私有化
 * （2）用一个静态变量的保存这个唯一的实例
 *  (3) 提供一个静态方法，获取这个实例对象
 */
public class Singleton5 {
    private static Singleton5 instance;
    private Singleton5(){

    }
    public static Singleton5 getInstance(){
        if(instance == null){//判空，如果instance存在，则不再进入锁中创建对象，保证效率
            synchronized (Singleton5.class){
                if(instance == null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
