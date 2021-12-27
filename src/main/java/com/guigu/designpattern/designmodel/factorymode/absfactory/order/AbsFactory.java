package com.guigu.designpattern.designmodel.factorymode.absfactory.order;

import com.guigu.designpattern.designmodel.factorymode.absfactory.pizza.Pizza;

/**
 * @author admin
 * @title: AbsFactory
 * @projectName base_thread
 * @description: 抽象工厂模式的抽象层（接口）
 * @date 2021/12/26 10:32
 */
public interface AbsFactory {
    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
