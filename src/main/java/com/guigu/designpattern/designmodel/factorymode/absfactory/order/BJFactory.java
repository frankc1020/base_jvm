package com.guigu.designpattern.designmodel.factorymode.absfactory.order;

import com.guigu.designpattern.designmodel.factorymode.absfactory.pizza.BJCheesePizza;
import com.guigu.designpattern.designmodel.factorymode.absfactory.pizza.BJPepperPizza;
import com.guigu.designpattern.designmodel.factorymode.absfactory.pizza.Pizza;

/**
 * @author admin
 * @title: BJFactory
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/27 08:44
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
