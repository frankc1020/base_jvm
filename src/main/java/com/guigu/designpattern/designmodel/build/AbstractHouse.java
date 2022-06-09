package com.guigu.designpattern.designmodel.build;

/**
 * @author admin
 * @title: AbstractHouse
 * @projectName base_thread
 * @description: TODO
 * @date 2022/1/13 11:30
 */
public abstract class  AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
