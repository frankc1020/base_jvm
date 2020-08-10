package com.guigu.designpattern.sevenprinciple.singleprinciple;

/**
 * @author admin
 * @title: SingleResponsibility1
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/28 14:34
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
//交通工具类
//方式一
//1.在方式1的run方法中，违反了单一职责原则
//2.解决方案非常简单，根据交通工具运行方法不同，分解成不同类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行。。。。。");
    }
}
