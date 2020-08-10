package com.guigu.audition.two.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1. cas是什么？  ======> compareAndSet
 *    比较并交换
 *    总结：如果线程的期望值跟主物理内存的真实值一样，即为compareAndSet方法返回值为true 就修改为更新值，
 *    如果线程的期望值跟主物理内存的真实值不一样，即为compareAndSet方法返回值为false 需要重新获取主物理内存的真实值
 */
public class CASDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);

        atomicInteger.getAndIncrement();
        System.out.println(atomicInteger.compareAndSet(5,2019) + "\t current data: " + atomicInteger.get());
//        int i = atomicInteger.get();
        System.out.println(atomicInteger.compareAndSet(6,2014) + "\t current data: " + atomicInteger.get());
    }

}
