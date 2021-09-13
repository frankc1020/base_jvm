package com.test.ftwon.collection;

import org.junit.Assert;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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



//        Date d = new Date();
//        DateFormat df = DateFormat.getDateInstance();
//        System.out.println(df.format(d));
//        d.setTime(60*60*24 + d.getTime());
//        System.out.println(df.format(d));
//        P p = new P();
//        P c = new C();
//        System.out.println();
        /*int i=9;
        switch(i){
            default:
                System.out.println("d");
            case 0:
                System.out.println("0");break;
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }*/

//        Boolean b = null;
//        System.out.println(b);
//
//        Assert.assertNull(b);
//        Assert.assertTrue(b);

        Map<String,Object> map = new HashMap<>();
        map.put("province_code","ZZZZ");
        System.out.println(map.get("actStatus"));

    }



}


class P{
    public static String getName(){
        return "Parent";
    }
}

class C extends P{
    public static String getName(){
        return "Child";
    }
}

