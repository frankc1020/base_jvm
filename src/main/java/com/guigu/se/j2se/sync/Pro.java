package com.guigu.se.j2se.sync;

/**
 * @author admin
 * @title: Pro
 * @projectName base_java
 * @description: 生产者
 * @date 2020/5/25 15:00
 */
public class Pro implements Runnable{
    private Info info;
    public Pro(){
    }
    public Pro(Info info){
        this.info = info;
    }

    @Override
    public void run() {
        for(int x=0;x<50;x++){
            if(x%2 == 0){
                /*this.info.setName("Java") ; try{
                    Thread.sleep(300) ;
                } catch (Exception e){}
                this.info.setDesc("www.sun.com") ;*/
                this.info.set("Java","www.sun.com");
            }else{
               /* this.info.setName("Oracle") ; try{
                    Thread.sleep(300) ;
                } catch (Exception e){}
                this.info.setDesc("数据库") ;*/
               this.info.set("Oracle","数据库");
            }
        }
    }
}
