package com.guigu.audition.two.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        System.out.println("******************come in Callable");
        //暂停一会线程
        try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { e.printStackTrace(); }
        return 1024;
    }
}
/**
 * 多线程中，第3种获得多线程的方式
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //m1
        //m2
        //m3

        //FutureTask(Callable<V> callable)
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        FutureTask<Integer> futureTask2 = new FutureTask<>(new MyThread());
        new Thread(futureTask, "AA").start();
        new Thread(futureTask2, "BB").start();

        System.out.println(Thread.currentThread().getName() + "**************************");
        int result01 = 100;
        while(!futureTask.isDone()){

        }
        //要求获得Callable线程的计算结果，如果没有计算完成就要去强求，会导致堵塞，直到计算完成。
        int result02 = futureTask.get();

//        System.out.println("************result" + futureTask.get());
        System.out.println("************result:" + (result01 + result02) );
    }
}
