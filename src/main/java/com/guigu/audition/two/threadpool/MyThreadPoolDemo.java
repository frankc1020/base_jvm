package com.guigu.audition.two.threadpool;

import java.util.concurrent.*;

/**
 * 第四种获得、使用java多线程的方式，线程池
 */
public class MyThreadPoolDemo {

    public static void threadPoolInit(){
        //接口类  工具类
        //Array Arrays
        //collection,Collections
        //Executor,Executors

//        ExecutorService threadpool = Executors.newFixedThreadPool(5);//一池5个处理线程
//        ExecutorService threadpool = Executors.newSingleThreadExecutor();//一池1个处理线程
        ExecutorService threadpool = Executors.newCachedThreadPool();//一池N个处理线程


        //模拟10个用户来办理业务，每隔用户就是一个来自外部的请求线程
        try {
            for (int i = 1; i <= 20; i++) {
                threadpool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
                //暂停一会线程
//                try { TimeUnit.MILLISECONDS.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadpool.shutdown();
        }
    }

    public static void myThreadPoolInit(){
        /**
         * public ThreadPoolExecutor(int corePoolSize, //核心线程池数量
         int maximumPoolSize,//线程池最大数量
         long keepAliveTime,//超过核心线程数量的线程存活时间
         TimeUnit unit,//keepAliveTime的时间单位
         BlockingQueue<Runnable> workQueue,//存储队列
         ThreadFactory threadFactory,//线程工厂
         RejectedExecutionHandler handler)//拒绝策略
         */
        ExecutorService threadPool = new ThreadPoolExecutor(2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        try {
            for (int i = 1; i <= 20; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
                //暂停一会线程
//                try { TimeUnit.MILLISECONDS.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPool.shutdown();
        }
    }

    public static void main(String[] args) {
        //获取cpu核数
        System.out.println(Runtime.getRuntime().availableProcessors());
        myThreadPoolInit();
    }

}
