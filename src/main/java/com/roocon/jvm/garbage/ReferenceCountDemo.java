package com.roocon.jvm.garbage;

/**
 * 引用计数算法详解
 */
public class ReferenceCountDemo {

    private Object instance;

    public ReferenceCountDemo(){
        byte [] m = new byte[20 * 1024 * 1024];
    }

    public static void main(String[] args) {
        ReferenceCountDemo demo1 = new ReferenceCountDemo();
        ReferenceCountDemo demo2 = new ReferenceCountDemo();

        demo1.instance = demo2;
        demo2.instance = demo1;

        demo1 = null;
        demo2 = null;

    }
}
