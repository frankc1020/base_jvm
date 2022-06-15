package com.guigu.designpattern.designmodel.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("===============类 适配器 模式================");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
