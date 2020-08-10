package com.guigu.se.j2se.single.test;

import com.guigu.se.j2se.single.Singleton1;
import com.guigu.se.j2se.single.Singleton2;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton1 s = Singleton1.INSTANCE;
        System.out.println(s);

        Singleton2 s2 = Singleton2.INSTANCE;
        System.out.println(s2);
    }
}
