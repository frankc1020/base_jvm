package com.guigu.se.j2se.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author admin
 * @title: ReflectDemo
 * @projectName base_java
 * @description: TODO
 * @date 2020/5/27 09:34
 */
public class ReflectDemo {

    @Test
    public void personTest() throws Exception {
        Class<?> cls = Class.forName("com.guigu.se.j2se.reflect.Person");
//        Person person = (Person) cls.newInstance();
        Constructor<?>[] constructors = cls.getConstructors();
        Person p = (Person) constructors[0].newInstance("张三", 20);
        System.out.println(p.getName() + ":" + p.getAge());
        Method fun = cls.getMethod("fun",String.class);
        fun.invoke(p,"pppppp");
    }
}
