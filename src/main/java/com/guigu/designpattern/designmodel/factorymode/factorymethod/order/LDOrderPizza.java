package com.guigu.designpattern.designmodel.factorymode.factorymethod.order;

import com.guigu.designpattern.designmodel.factorymode.factorymethod.pizza.BJCheesePizza;
import com.guigu.designpattern.designmodel.factorymode.factorymethod.pizza.LDCheesePizza;
import com.guigu.designpattern.designmodel.factorymode.factorymethod.pizza.LDPepperPizza;
import com.guigu.designpattern.designmodel.factorymode.factorymethod.pizza.Pizza;

/**
 * @author admin
 * @title: BJOrderPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/23 17:09
 */
public class LDOrderPizza extends OrderPizza {
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
