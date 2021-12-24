package com.guigu.designpattern.designmodel.factorymode.simplefactory;

/**
 * @author admin
 * @title: SimpleFacotry
 * @projectName base_thread
 * @description: 简单工厂类
 * @date 2021/12/22 17:43
 */
public class SimpleFactory {
    //根据orderType 返回对应的Pizza对象
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    //简单工厂模式也叫做静态工厂模式
    public static Pizza createPizza2(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
