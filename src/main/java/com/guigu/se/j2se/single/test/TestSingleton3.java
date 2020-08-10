package com.guigu.se.j2se.single.test;

import com.guigu.se.j2se.single.Singleton3;

public class TestSingleton3 {
    public static void main(String[] args) {
        Singleton3 s = Singleton3.INSTANCE;
        System.out.println(s);
    }
}
