package com.guigu.se.j2se.sync;

/**
 * @author admin
 * @title: Info
 * @projectName base_java
 * @description: 基本信息
 * @date 2020/5/25 15:00
 */
public class Info {
    private String name = "oracle";
    private String desc = "数据库";
    private boolean flag = false ; // 定义一个标记
    /*
        flag = true，表示可以生产，但是不能取得
        flag = false，表示可以取得，但是不能生产
    */

    /**
     *如果是消费则进行等待，生产则直接设置值
     */
    public synchronized  void set(String name,String desc){
        if(!this.flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        //暂停一会线程
        try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        this.setDesc(desc);
        this.flag = false;
        this.notify();
    }

    /**
     * 如果是消费，则可以直接取值，取完值之后设置标识为true即生产
     */
    public synchronized  void get(){
        if(this.flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //暂停一会线程
        try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println(this.name + "--------->" + this.desc);
        this.flag = true;
        this.notify();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
