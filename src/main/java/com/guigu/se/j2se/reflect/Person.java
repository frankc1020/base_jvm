package com.guigu.se.j2se.reflect;

import java.io.Serializable;

/**
 * @author admin
 * @title: Person
 * @projectName base_java
 * @description: TODO
 * @date 2020/5/27 09:32
 */
public class Person implements Serializable{
    private String name;
    private int age;

    public Person(){
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fun(String str){
        System.out.println("终于出来了，我的名字："+this.name+",我的年龄："+this.age+"，这后面是狗屁啊"+str);
    }
}
