package com.guigu.audition.two.threadpool;

import java.util.concurrent.TimeUnit;

class HoldLockThread implements Runnable{

    private String LockA;
    private String LockB;

    public HoldLockThread(String lockA, String lockB) {
        LockA = lockA;
        LockB = lockB;
    }

    @Override
    public void run() {
        synchronized (LockA){
            System.out.println(Thread.currentThread().getName()+ "\t 自己持有：" + LockA + "\t 尝试获得：" + LockB);
            //暂停一会线程
            try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
            synchronized (LockB){
                System.out.println(Thread.currentThread().getName()+ "\t 自己持有：" + LockB + "\t 尝试获得：" + LockA);
            }
        }
    }
}

/**
 * 死锁是指两个或两个以上的进程在执行过程中，
 * 因争夺资源而造成的一种相互等待的现象，
 * 若无外力干涉那它们都将无法推进下去
 */
public class DeadLockDemo {

    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HoldLockThread(lockA,lockB),"ThreadAAA").start();
        new Thread(new HoldLockThread(lockB,lockA),"ThreadBBB").start();

        /**
         * linux ps -ef | grep xxxx
         * windows 下的java运行程序  也有类似ps的查看进程的命令，但是目前我们需要看的只是java
         *            jps = java ps      jps -l
         *
         *  jstack 找到死锁查看进程号 jstack 32935
         */

    }
}
