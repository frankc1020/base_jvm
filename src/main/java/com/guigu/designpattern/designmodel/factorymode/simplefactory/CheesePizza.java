package com.guigu.designpattern.designmodel.factorymode.simplefactory;

/**
 * @author admin
 * @title: CheesePizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/22 16:16
 */
public class CheesePizza extends Pizza{
    public void prepare() {
        System.out.println(" 给奶酪披萨 准备原材料 ");
    }
}
