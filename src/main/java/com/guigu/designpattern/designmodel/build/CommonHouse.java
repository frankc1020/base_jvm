package com.guigu.designpattern.designmodel.build;

/**
 * @author admin
 * @title: CommonHouse
 * @projectName base_thread
 * @description: TODO
 * @date 2022/1/13 13:40
 */
public class CommonHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }
}
