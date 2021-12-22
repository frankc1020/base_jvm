package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest3
 * @projectName base_thread
 * @description: TODO
 * @date 2021/10/9 13:34
 *  懒汉式第一种写法  单例模式第3种
 */
public class SingletonTest3 {
}
//懒汉式（线程不安全）
class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){}

    //提供一个静态的公共方法,当使用到该方法时，才创建instance
    //即懒汉式
    public static Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}