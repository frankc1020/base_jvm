package com.guigu.designpattern.designmodel.factorymode.simplefactory;

/**
 * @author admin
 * @title: PizzaStore
 * @projectName base_thread
 * @description: 相当于一个客户端，发出披萨的订购任务
 * @date 2021/12/22 16:26
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
//        System.out.println("~~~~退出程序~~~ ");
        new OrderPizza2();
    }
}
