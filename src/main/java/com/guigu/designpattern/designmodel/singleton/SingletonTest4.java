package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest3
 * @projectName base_thread
 * @description: TODO
 * @date 2021/10/9 13:34
 * 懒汉式第二种写法  单例模式第4种
 *
 * 懒汉式的同步代码块就是不在方法上面加synchronized 改为在if判断里面，
 * 该种方法线程不安全，当过了if判断，则一定会创建对象
 */
public class SingletonTest4 {
}

//懒汉式（线程安全） 加入同步方法，解决线程安全
//在方法上面加入 关键字synchronized 保证方法同步
class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){}

    //加入同步方法，解决线程安全
    public static synchronized Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }

    /*
     * 第五种方法 懒汉式同步代码块 线程不安全，不推荐使用
     * 懒汉式的同步代码块就是不在方法上面加synchronized 改为在if判断里面，
     * 该种方法线程不安全，当过了if判断，则一定会创建对象
     */
    public static  Singleton4 getInstanceOne(){
        if(instance == null){
            synchronized(Singleton4.class){
                instance = new Singleton4();
            }

        }
        return instance;
    }

}