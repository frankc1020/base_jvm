package com.guigu.se.j2se.sync;

/**
 * @author admin
 * @title: Cus
 * @projectName base_java
 * @description: 消费者
 * @date 2020/5/25 15:01
 */
public class Cus implements Runnable{
    private Info info;
    public Cus(){}
    public Cus(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            /*try{
                Thread.sleep(300) ;
            } catch (Exception e){}*/
//            System.out.println(this.info.getName() + " --> " + this.info.getDesc()) ;
            this.info.get();
        }
    }
}
