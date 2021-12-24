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
public class OrderPizza2 {

    Pizza pizza = null;
    String orderType = "";
    public  OrderPizza2(){

        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

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
