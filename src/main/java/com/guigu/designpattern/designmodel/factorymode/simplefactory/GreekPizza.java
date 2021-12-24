package com.guigu.designpattern.designmodel.factorymode.simplefactory;

/**
 * @author admin
 * @title: GreekPizza
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/22 16:15
 */
public class GreekPizza  extends Pizza{
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
