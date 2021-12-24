package com.guigu.designpattern.designmodel.factorymode.factorymethod.order;


import com.guigu.designpattern.designmodel.factorymode.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author admin
 * @title: OrderPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/22 16:17
 */
public abstract class OrderPizza {
    //定义一个抽象的方法，createPizza，让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do{
            orderType = getType();
            //抽象方法由工厂子类完成
            pizza = createPizza(orderType);
            //输出 pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
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
