package com.guigu.designpattern.designmodel.adapter.objadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("===============类 适配器 模式================");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
