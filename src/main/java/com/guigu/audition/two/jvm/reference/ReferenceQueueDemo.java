package com.guigu.audition.two.jvm.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class ReferenceQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<Object>(obj1,referenceQueue);
        System.out.println(obj1);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());

        System.out.println("=============================");
        obj1 = null;
        System.gc();
        Thread.sleep(500);

        System.out.println(obj1);
        System.out.println(weakReference.get());
        //软引用、弱引用和虚引用在被回收的时候会被放在引用队列里面
        System.out.println(referenceQueue.poll());

    }
}
