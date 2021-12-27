package com.guigu.designpattern.designmodel.factorymode.absfactory.order;

import com.guigu.designpattern.designmodel.factorymode.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author admin
 * @title: OrderPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/27 08:53
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = "";//用户输入
        this.factory = factory;
        do{
            orderType = getType();
            //factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while(true);
    }

    //可以获取客户订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strin.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
