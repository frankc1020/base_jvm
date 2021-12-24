package com.guigu.designpattern.designmodel.factorymode.factorymethod.pizza;

/**
 * @author admin
 * @title: BJPepperPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/23 17:03
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨 准备原料");
    }
}
