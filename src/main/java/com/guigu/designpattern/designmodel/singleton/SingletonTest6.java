package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest3
 * @projectName base_thread
 * @description: TODO
 * @date 2021/10/9 13:34
 * 第六种方法
 */
public class SingletonTest6 {
}

class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6(){}
    /*
     * 第六种方法
     * 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
     * 同时保证了效率
     */
    public static Singleton6 getInstance(){
        if(instance == null){
            synchronized(Singleton6.class){
                if(instance == null) {
                    instance = new Singleton6();
                }
            }

        }
        return instance;
    }

}