package com.guigu.designpattern.designmodel.factorymode.simplefactory;

/**
 * @author admin
 * @title: Pizza
 * @projectName base_thread
 * @description: 将Pizza 类做成抽象
 * @date 2021/12/22 15:56
 */
public abstract class Pizza {
    protected String name; //名字
    //准备原材料，不同的pizza不一样，因此做成一个抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
