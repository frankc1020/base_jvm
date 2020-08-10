package com.guigu.se.j2se.obj;

/**
 * @author admin
 * @title: Demo
 * @projectName base_java
 * @description: TODO
 * @date 2020/5/16 22:38
 */
public class Demo implements C {
    @Override
    public void printB() {
        System.out.println("B=======");
    }

    @Override
    public void printA() {
        System.out.println("A=======");
    }

    @Override
    public void printC() {
        System.out.println("C=========");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.printA();
        demo.printB();
        demo.printC();
    }
}
