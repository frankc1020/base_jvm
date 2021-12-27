package com.guigu.designpattern.designmodel.factorymode.absfactory.order;

import com.guigu.designpattern.designmodel.factorymode.absfactory.pizza.*;

/**
 * @author admin
 * @title: LDFactory
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/27 08:47
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
