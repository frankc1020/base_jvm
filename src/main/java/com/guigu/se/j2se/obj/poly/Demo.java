package com.guigu.se.j2se.obj.poly;


import org.junit.jupiter.api.Test;

/**
 * @author admin
 * @title: Demo
 * @projectName base_java
 * @description: 对象多态性测试
 * @date 2020/5/20 18:25
 */
public class Demo {
    /**
     * 所谓的向上转型，实际上指的就是一个子类变为父类接收，
     * 但是调用的方法肯定是被子类所覆写过的操作。
     */
    @Test
    public void PolDemo01(){
        A a = new B() ; // 子类对象变为父类对象
         a.fun() ;
    }
    @Test
    public void PolDemo02(){
        A a = new B() ; // 子类对象变为父类对象
        B b = (B) a ; // 父类对象变为子类对象
        b.fun() ;
    }

    /**
     * 表示的是一个类转换异常，主要的功能是由于两个类之间没有任何的关系所发生的转换。
     在进行向下转型之前必须首先发生向上转型的关系，建立关系。
     */
    @Test
    public void PolDemo03(){
        A a=new A(); //父类对象实例化
        B b = (B) a ; // 父类对象变为子类对象
        b.fun() ;
    }

    /**
     * 当子类向上转型之后是不能在调用子类中所特有的方法，只能调用父类和子类中都有的方法，且调用共有的方法时，使用的是子类所定义的
     * 只有当子类在向下转型的时候，才可以在调用子类所特有的方法
     */
    @Test
    public void PolDemo04(){
        A a = new B() ; // 父类对象实例化
        // a.printB() ;// 错误的
        B b = (B) a ;// 向下转型
        b.printB() ;
    }

    /**
     * 通过 instanceof 关键字可以判断某一个对象是否是某一个类的实例。
     */
    @Test
    public void InstanceDemo(){
        A a = new A();
        System.out.println(a instanceof  A);
        System.out.println(a instanceof  B);
        A b = new B();//子类一定是父类的实例
        System.out.println(b instanceof  A);
        System.out.println(b instanceof  B);
    }
}
