package com.guigu.se.j2se.single;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 饿汉式：静态代码块饿汉式
 *
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    private String info;
    static {
        Properties pro = new Properties();
        try {
//            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("properties/singleproperties"));
            pro.load(new FileReader("properties/single.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String single =  pro.getProperty("single");
        INSTANCE = new Singleton3(single);
    }
    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}
