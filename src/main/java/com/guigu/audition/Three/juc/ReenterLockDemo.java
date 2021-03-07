package com.guigu.audition.Three.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author admin
 * @title: ReenterLockDemo
 * @projectName base_thread
 * @description: 可重入锁
 * @date 2021/3/7 11:18
 */
public class ReenterLockDemo {

    static Object lockA = new Object();

    //可重入锁同步代码块验证，同一个线程可重复获取用一个锁
    static void m1(){
        new Thread(()->{
           synchronized(lockA){
               System.out.println(Thread.currentThread().getName() + "----可重入锁之外层锁");
               synchronized (lockA){
                   System.out.println(Thread.currentThread().getName() + "----可重入锁之中层锁");
                   synchronized (lockA){
                       System.out.println(Thread.currentThread().getName() + "----可重入锁之内层锁");
                   }
               }
           }
        },"t1").start();
    }

    //同步方法

    public synchronized  void m2(){
        System.out.println( "----外");
        m3();
    }
    public synchronized  void m3(){
        System.out.println( "----中");
        m4();
    }
    public synchronized  void m4(){
        System.out.println( "-----内");
    }


    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
       new Thread(()->{
           lock.lock();
           try {
               System.out.println(Thread.currentThread().getName() + "----外层锁");
               lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "----内层锁");
                }finally {
                    //注意:实现加锁的次数和释放的次数要一样
                    //如果加锁的次数和释放锁的次数不一样，第二个线程始终无法获取到锁，导致一直等待
                    lock.unlock();//正常情况下，加锁几次就要释放几次
                }
           }finally {
                lock.unlock();
           }
       },"t1").start();

    }
}
