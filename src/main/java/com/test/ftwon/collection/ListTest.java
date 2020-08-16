package com.test.ftwon.collection;

import com.alibaba.fastjson.JSON;
import com.guigu.se.j2se.reflect.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @title: ListTest
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/2 10:22
 */
public class ListTest {
    private List<Person>  personList = new ArrayList<>();

    public void fun(){
        Person p1 = new Person();
        p1.setName("asda");
        p1.setAge(20);
        Person p2 = new Person();
        p2.setName("adsa");
        p2.setAge(39);
        personList.add(p1);
        personList.add(p2);

    }

    public  void toList(){
         List<Person>  personList = this.personList;
        System.out.println(JSON.toJSON(personList));

    }

    public static void main(String[] args) {
        ListTest test = new ListTest();
        test.fun();
        test.toList();

    }
}
