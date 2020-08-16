package com.test.ftwon.collection;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author admin
 * @title: Test
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/24 13:19
 */
public class Test {
    int count = 9;
    public void a(){
        int count =10;
        System.out.println("count1="+count);
    }
    public void count(){
        System.out.println("count2:"+count);
    }

    public static void main(String[] args) {
//        Test t =new Test();
//        t.a();
//        t.count();

       /* Set<Short> s = new HashSet<Short>();
        for(Short i=0;i<100;i++){
            s.add(i);
            System.out.println(s.remove(i-1));
        }
        System.out.println(s.size());*/



        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(d));
        d.setTime(60*60*24 + d.getTime());
        System.out.println(df.format(d));
        
    }


}
