package com.guigu.se.j2se.obj.poly;

/**
 * @author admin
 * @title: A
 * @projectName base_java
 * @description: 对象多态性父类
 * @date 2020/5/20 18:25
 */
public class A {
    public void print(){
        System.out.println("A --> public void print(){}") ;
    }
    public void fun(){
        this.print() ;
    }
}
