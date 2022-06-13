package com.guigu.designpattern.designmodel.build.improve;

/**
 * @author admin
 * @title: CommHouse
 * @projectName base_thread
 * @description: TODO
 * @date 2022/6/9 16:42
 */
public class CommHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子打屋顶");
    }
}
