package com.guigu.designpattern.designmodel.prototype.deepclone;

/**
 * @author admin
 * @title: Client
 * @projectName base_thread
 * @description: TODO
 * @date 2022/1/7 15:00
 */
public class Client {

    public static void main(String[] args)throws  Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");

        //方式1 完成深拷贝
//        DeepProtoType p2 = (DeepProtoType)p.clone();
//        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
//        System.out.println("p2.name=" + p2.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        DeepProtoType p2 = (DeepProtoType)p.deepClone();
        System.out.println("p.name=" + p.name + "p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
        System.out.println("p2.name=" + p2.name + "p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());


    }

}
