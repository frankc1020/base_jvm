package com.guigu.designpattern.designmodel.build.improve;

/**
 * @author admin
 * @title: House
 * @projectName base_thread
 * @description: TODO
 * @date 2022/6/9 16:35
 */
//产品 -> Product
public class House {

    private  String baise;

    private String wall;

    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
