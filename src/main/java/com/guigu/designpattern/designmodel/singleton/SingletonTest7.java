package com.guigu.designpattern.designmodel.singleton;

/**
 * @author admin
 * @title: SingletonTest7
 * @projectName base_thread
 * @description: TODO
 * @date 2021/10/11 09:25
 *第七种 静态内部类
 */
public class SingletonTest7 {
}

class Singleton7 {
    private Singleton7(){}

    private  static class SingletonInstance{
        private static final Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingletonInstance.instance;
    }

}