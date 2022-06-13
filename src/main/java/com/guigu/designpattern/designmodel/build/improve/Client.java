package com.guigu.designpattern.designmodel.build.improve;

/**
 * @author admin
 * @title: Client
 * @projectName base_thread
 * @description: TODO
 * @date 2022/6/13 09:04
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommHouse commHouse = new CommHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commHouse);

        //完成盖房子，返回产品（房子）
        House house = houseDirector.constructHouse();
        System.out.println(house);

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        house = houseDirector.constructHouse();
        System.out.println(house);
    }

}
