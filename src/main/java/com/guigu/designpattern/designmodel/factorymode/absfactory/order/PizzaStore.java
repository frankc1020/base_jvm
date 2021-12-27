package com.guigu.designpattern.designmodel.factorymode.absfactory.order;

/**
 * @author admin
 * @title: PizzaStore
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/27 09:08
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
