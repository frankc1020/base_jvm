package com.guigu.designpattern.designmodel.build.improve;

/**
 * @author admin
 * @title: HouseDirector
 * @projectName base_thread
 * @description: TODO
 * @date 2022/6/13 08:54
 */
//指挥者，这里去指定制作流程
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过setter 传入houseBuilder

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
