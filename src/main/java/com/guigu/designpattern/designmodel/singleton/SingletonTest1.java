package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest1
 * @projectName base_thread
 * @description: TODO
 * @date 2021/10/9 11:03
 * 饿汉式第一种写法  单例模式第1种
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1 hashCode="+singleton1.hashCode());
        System.out.println("singleton2 hashCode="+singleton2.hashCode());
    }
}
//饿汉式（静态变量）
class Singleton1{
  //1、构造器私有化，外部不能new
  private Singleton1(){

  }
  //2、本类内部创建对象实例
  private final static Singleton1 INSTANCE = new Singleton1();

  //3、提供一个公有的静态方法，返回实例对象
  public static Singleton1 getInstance(){
      return INSTANCE;
  }
}
