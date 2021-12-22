package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest8
 * @projectName base_thread
 * @description: TODO
 * 第8种方式，枚举
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance == instance2);

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOk();

    }
}
//使用枚举，可以实现单例，推荐使用
enum Singleton8{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok!~");
    }
}
