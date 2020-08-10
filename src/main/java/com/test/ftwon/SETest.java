package com.test.ftwon;

import org.junit.Test;

/**
 * @author admin
 * @title: SETest
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/17 13:37
 */
public class SETest {

    @Test
    public void roundTest(){
//        System.out.println(Math.round(-11.6));
//        System.out.println(Math.round(-11.4));
        String username = null;
//        if(username.equals("js")){
        if("js".equals(username)){
            System.out.println("=========");

        }
//        int sum=0;
//        int n = Character.digit('a',16);
//        sum += n * (1<<(4*2));
//        System.out.println(1<<(4*2));

        String str = "13abf";
        int len = str.length();
        int sum = 0;
        for(int i=0;i<len;i++){
            char c = str.charAt(len-1-i);
            int n = Character.digit(c,16);
            sum += n * (1<<(4*i));
            System.out.println("c:"+c+"====  n:"+n+"=====1<<(4*i):" + (1<<(4*i))+ "=====:"+sum);
        }
    }
}
