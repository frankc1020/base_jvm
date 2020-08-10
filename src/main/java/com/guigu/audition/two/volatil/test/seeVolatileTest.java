package com.guigu.audition.two.volatil.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author admin
 * @title: seeVolatileTest
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/15 13:24
 */
public class seeVolatileTest {
    public static void main(String[] args) {
        myData data = new myData();
        new Thread(()-> {
            //暂停一会线程
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            data.addT060();
        }).start();
        //等于0的时候，main线程一直循环
        while(data.num == 0){

        }

        System.out.println("================"+data.num);

    }
}

class myData{
    volatile int num = 0;
    public void addT060(){
        this.num = 60;
    }

    public void addPlusPlus(){
        num++;
    }

    AtomicInteger atomicInteger = new AtomicInteger();
    public void addAtomic(){

    }

}
