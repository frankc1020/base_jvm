package com.guigu.designpattern.designmodel.build.improve;

/**
 * @author admin
 * @title: HighBuilding
 * @projectName base_thread
 * @description: TODO
 * @date 2022/6/9 16:44
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼透明的屋顶");
    }
}
