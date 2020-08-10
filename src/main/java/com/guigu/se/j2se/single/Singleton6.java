package com.guigu.se.j2se.single;

/**
 * 懒汉式： 静态内部类形式
 *    线程安全的（适用于多线程）
 *
 * （1）构造器私有化
 * （2）用一个静态变量的保存这个唯一的实例
 *  (3) 提供一个静态方法，获取这个实例对象
 */
public class Singleton6 {
    private Singleton6(){

    }

    /**
     * 在内部类被加载和初始化时，才创建INSTANCE实例对象
     * 静态内部类不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化
     * 因为是在内部类加载和初始化时，创建的，因此线程是安全的。
     */
    private static  class Inner{
        private static final Singleton6  INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }

}
