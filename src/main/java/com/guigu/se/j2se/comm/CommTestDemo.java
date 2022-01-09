package com.guigu.se.j2se.comm;


import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author admin
 * @title: CommTestDemo
 * @projectName base_java
 * @description: java中常用类库
 * @date 2020/5/27 09:09
 */
public class CommTestDemo {
    @Test
    public void matcherTest(){
        String str = "11-234-45";
        Pattern pat = Pattern.compile("\\d{2}-\\d{3}-\\d{2}");
        Matcher mat = pat.matcher(str);
        if (mat.matches()) {
            System.out.println("验证通过!");
        }else{
            System.out.println("校验失败！！！");
        }

    }
    @Test
    public void matcherStrTest(){
        String str = "helloworld";
        Pattern pat = Pattern.compile("\\w{6,15}");
        Matcher mat = pat.matcher(str);

        if (mat.matches()) {
            System.out.println("验证通过!");
        }
    }

    @Test
    public void matcherSplitTest(){
        String str = "a1b22c333d4444e55555f";
        Pattern pat = Pattern.compile("\\d+");
        Matcher mat = pat.matcher(str);
        System.out.println(mat.replaceFirst("GG"));
        System.out.println(mat.replaceAll("X")) ;
    }
}
