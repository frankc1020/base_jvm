package com.guigu.designpattern.designmodel.factorymode.absfactory.pizza;

/**
 * @author admin
 * @title: BJPepperPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/23 17:03
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("北京的胡椒披萨 准备原料");
    }
}
