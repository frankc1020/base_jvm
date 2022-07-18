package com.guigu.designpattern.designmodel.decorated;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
