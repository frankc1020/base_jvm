package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest1
 * @projectName base_thread
 * @description: TODO
 * @date 2021/10/9 11:03
 * 饿汉式第二种写法  单例模式第2种
 */
public class SingletonTest2 {
    private Singleton1 singleton1;

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("Singleton2 hashCode="+singleton1.hashCode());
        System.out.println("singleton2 hashCode="+singleton2.hashCode());
    }
}

//饿汉式（静态代码块）
class Singleton2{
  //1、构造器私有化，外部不能new
  private Singleton2(){

  }
  //2、本类内部创建对象实例
  private  static Singleton2 INSTANCE;

  static {//在静态代码块中，创建代理对象
      INSTANCE = new Singleton2();
  }

  //3、提供一个公有的静态方法，返回实例对象
  public static Singleton2 getInstance(){
      return INSTANCE;
  }
}
