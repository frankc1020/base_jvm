package com.guigu.designpattern.sevenprinciple.liskov.improve;

/**
 * @author admin
 * @title: Liskov
 * @projectName base_thread
 * @description: 里氏替换原则
 * @date 2020/8/18 10:44
 *
 * 解决办法：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，采用依赖，聚合，组合等关系替代
 *
 */
public class LiskovImprove {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-8="+a.fun1(1,8));

        System.out.println("--------------------------");
        B b = new B();
        //因为B类不在继承A类，因此调用者，不在fun1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3="+b.fun1(11,3));//11+3
        System.out.println("1+8="+b.fun1(1,8));//1+8
        System.out.println("11+3+9="+b.fun2(11,3));
        //使用组合仍然可以使用到A类相关方法
        System.out.println("11-3="+b.fun3(11,3));
    }
}
//创建一个更基础的基类
class Base{
    //把更基础的方法和成员写到Base类
}

class A extends Base{
    //返回两个数的差
    public int fun1(int a,int b){
        return a  -b;
    }
}

class B extends Base {
    private A a = new A();
    //返回两个数的和
    public int fun1(int a, int b) {
        return a + b;
    }
    public int fun2(int a, int b) {
        return fun1(a,b)+9;
    }

    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }
}
