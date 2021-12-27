package com.guigu.designpattern.designmodel.factorymode.absfactory.pizza;

/**
 * @author admin
 * @title: BJCheesePizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/23 17:02
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨 准备原料");
    }
}
