package com.guigu.se.j2se.sync;

/**
 * @author admin
 * @title: MyThreadDemo
 * @projectName base_java
 * @description: TODO
 * @date 2020/5/25 14:26
 */
public class MyThreadDemo {

    public static void main(String[] args) {
        /*Thread thread = new Thread();
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();*/
        Info info = new Info() ;
        Pro p = new Pro(info) ;
        Cus c = new Cus(info) ;
        new Thread(p).start() ;
        new Thread(c).start() ;
    }

    /**
     * 死锁测试
     */
   /* @Test
    public void deadLock(){
        Info info = new Info() ;
        Pro p = new Pro(info) ;
        Cus c = new Cus(info) ;
        new Thread(p).start() ;
        new Thread(c).start() ;
    }*/
}
