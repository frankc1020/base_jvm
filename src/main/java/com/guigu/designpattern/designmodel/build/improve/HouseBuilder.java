package com.guigu.designpattern.designmodel.build.improve;

/**
 * @author admin
 * @title: HouseBuilder
 * @projectName base_thread
 * @description: TODO
 * @date 2022/6/9 16:38
 */
//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造房子好了之后，将产品（房子）返回
    public House buildHouse(){
        return house;
    }
}
