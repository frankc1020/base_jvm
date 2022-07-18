package com.guigu.designpattern.designmodel.decorated;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下订单，2份巧克力+ 一份牛奶 的longBloack
        Drink order = new LongBlack();
        System.out.println("费用1："+order.cost());
        System.out.println("描述1："+order.getDes());
        order = new Milk(order);
        System.out.println("费用2："+order.cost());
        System.out.println("描述2："+order.getDes());

        order = new Chocolate(order);

        System.out.println("费用3："+order.cost());
        System.out.println("描述3："+order.getDes());

        order = new Chocolate(order);

        System.out.println("费用4："+order.cost());
        System.out.println("描述4："+order.getDes());

    }
}
