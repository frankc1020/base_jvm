package com.guigu.designpattern.designmodel.factorymode.absfactory.pizza;

/**
 * @author admin
 * @title: BJCheesePizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/23 17:02
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪披萨 准备原料");
    }
}
