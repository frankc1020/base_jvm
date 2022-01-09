package com.guigu.se.j2se.comm;


import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

/**
 * @author admin
 * @title: RegexDemo
 * @projectName base_java
 * @description: 正则表达式
 * @date 2020/5/27 09:05
 */
public class RegexDemo {

    @Test
    public void regexTest(){
        String str = "a1b22c333d4444e55555f";
        Pattern pat = Pattern.compile("\\d+");
        String s[] = pat.split(str); // 拆分
        for (int x = 0; x < s.length; x++) {
            System.out.println(s[x]);
        }
    }
}
