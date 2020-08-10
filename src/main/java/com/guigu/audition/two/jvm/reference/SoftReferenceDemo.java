package com.guigu.audition.two.jvm.reference;

import java.lang.ref.SoftReference;

/**
 * 软引用介绍
 */
public class SoftReferenceDemo {
    public static void main(String[] args) {
//        softRef_Memory_Enough();
        softRef_Memory_NotEnough();
    }

    /**
     * 内存够用的时候就保留，不够用就回收
     */
    public static void softRef_Memory_Enough(){
        Object obj1 = new Object();
        SoftReference<Object> softReference = new SoftReference<Object>(obj1);
        System.out.println(obj1);
        System.out.println(softReference.get());

        obj1 = null;
        System.gc();

        System.out.println(obj1);
        System.out.println(softReference.get());
    }

    /**
     * JVM配置，故意产生大对象并配置小内存，让它内存不够用了导致OOM(OutOfMemoryError),看软引用的回收情况
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    public static void softRef_Memory_NotEnough(){
        Object obj1 = new Object();
        SoftReference<Object> softReference = new SoftReference<Object>(obj1);
        System.out.println(obj1);
        System.out.println(softReference.get());

        obj1 = null;
//        System.gc();
        try {
            byte[] bytes = new byte[30 * 1024 * 1024];
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(obj1);
            System.out.println(softReference.get());
        }

    }
}
