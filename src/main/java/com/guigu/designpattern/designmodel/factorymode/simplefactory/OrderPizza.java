package com.guigu.designpattern.designmodel.factorymode.simplefactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author admin
 * @title: OrderPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/22 16:17
 */
public class OrderPizza {
   /* public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do{
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
            }else if(orderType.equals("pepper")){
                pizza = new PepperPizza();
            }else{
                break;
            }
            //输出 pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;//设置简单工厂对象
        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if(pizza != null){//订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println(" 订购披萨失败 ");
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
