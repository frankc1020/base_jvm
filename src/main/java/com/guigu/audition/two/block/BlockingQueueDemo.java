package com.guigu.audition.two.block;

import java.sql.Time;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * ArrayBlockingQueue：是一个基于数组结构的有界对列，此队列按FIFO（先进先出）原则对元素进行排序
 * LinkedBlockingQueue：一个基于链表结构的阻塞队列，此队列按FIFO（先进先出）排序元素，吞吐量通常要高于ArrayBlockingQueue。
 * SynchronousQueue：一个不存储元素的阻塞队列，每个插入操作必须等到另一个线程调用移除操作，否则插入操作一直处于阻塞状态，吞吐量通常要高
 *
 * 1. 队列
 *
 * 2. 阻塞队列
 *    2.1 阻塞队列有没有好的一面
 *
 *    2.2 不得不阻塞，你如何管理
 *
 *
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Integer.MAX_VALUE / (1024*1024));
//        exceptionBlocking();
//        booleanBlocking();
//        blockBlocking();
        timeOutBlocking();
    }

    /**
     * 抛出异常的队列
     */
    public static void exceptionBlocking(){
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.add("a"));//正常插入的会显示true
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));
//        System.out.println(blockingQueue.add("x")); //多的这个会抛异常

//        System.out.println(blockingQueue.element());//只取队列的第一个值
//        System.out.println(blockingQueue.element());

        System.out.println(blockingQueue.remove());//正常会移除会显示在首个的值
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());//多移除的会抛出异常
    }

    /**
     * 返回布尔值的队列
     */
    public static void booleanBlocking(){
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a"));//正常插入的会显示true
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
        System.out.println(blockingQueue.offer("x"));//多的这个会显示false

        System.out.println(blockingQueue.peek());//显示在首个的值

        System.out.println(blockingQueue.poll());//正常会移除会显示在首个的值
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());//多的会显示null
    }

    /**
     * 队列阻塞
     */
    public static void blockBlocking() throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        System.out.println("==================");
        blockingQueue.put("x");

        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());
        System.out.println(blockingQueue.take());

    }

    /**
     * 超时队列
     */
    public static  void timeOutBlocking() throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));

        System.out.println(blockingQueue.poll(2L,TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(2L,TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(2L,TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(2L,TimeUnit.SECONDS));

    }

}
