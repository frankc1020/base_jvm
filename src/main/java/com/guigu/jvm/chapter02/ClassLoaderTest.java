package com.guigu.jvm.chapter02;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author admin
 * @title: ClassLoaderTest
 * @projectName base_thread
 * @description: TODO
 * @date 2021/8/11 10:07
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        System.out.println("**************启动类加载器****************");
        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }

        System.out.println("**************扩展类加载器*****************");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }

    }
}
