package com.guigu.se.j2se.obj.abstractandinterface;

/**
 * @author admin
 * @title: DemoImpl
 * @projectName base_java
 * @description: TODO
 * @date 2020/5/21 13:45
 */
public class DemoImpl  extends Demo{
    private int x = 10 ;
    public DemoImpl(){
        System.out.println("DemoImpl无参:"+this.x);
    }
    public DemoImpl(int x){
        this.x = x ;
        System.out.println("DemoImpl:"+this.x);
    }
    public void print(){
        System.out.println("DemoImpl-print x = " + this.x) ;
    }

    public static void main(String[] args) {
        /**
         * //初始化的时候的先调用抽象类无参构造函数
         * ，因为使用抽象类无参构造函数初始化，x还没有被赋值，
         * 默认初始化为0,所以结果为0
         */
        new DemoImpl(100);
    }
}
