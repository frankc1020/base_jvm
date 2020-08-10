package com.guigu.audition.two.oom;

/**
 * 栈异常
 */
public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError() {
        //撑爆栈空间
        stackOverflowError();//Exception in thread "main" java.lang.StackOverflowError
    }
}
