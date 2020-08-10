package com.guigu.audition.two.jvm;

public class HelloGC {
    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("*******HelloGC");
        Thread.sleep(Integer.MAX_VALUE);*/
        /*int a = 100;
        int b = 200;
        int retValue = a + b;
        System.out.println("***************************retValue: " + retValue);*/

        long totalMemory = Runtime.getRuntime().totalMemory();//返回java虚拟机的内存总量
        long maxMemory = Runtime.getRuntime().maxMemory();//返回java虚拟机试图使用的最大内存
        System.out.println("TOTAL_MEMORY(-Xms) = " + totalMemory + " (字节)、 " + (totalMemory / (double)1024 / 1024) + "MB");
        System.out.println("MAX_MEMORY(-Xmx) = " + maxMemory + " (字节)、 " + (maxMemory / (double)1024 / 1024) + "MB");

    }
}
