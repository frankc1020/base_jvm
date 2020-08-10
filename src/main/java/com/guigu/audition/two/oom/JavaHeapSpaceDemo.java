package com.guigu.audition.two.oom;

/**
 * 堆异常
 */
public class JavaHeapSpaceDemo {
    public static void main(String[] args) {
        /*String str = "atguigu";
        while(true){
            str += str + new Random().nextInt(111111111) + new Random().nextInt(22222222);
            str.intern();
        }*/
        byte[] bytes = new byte[8 * 1024 * 1024];
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }

}
