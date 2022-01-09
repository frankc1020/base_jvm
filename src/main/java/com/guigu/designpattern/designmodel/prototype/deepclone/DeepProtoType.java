package com.guigu.designpattern.designmodel.prototype.deepclone;

import java.io.*;

/**
 * @author admin
 * @title: DeepProtoType
 * @projectName base_thread
 * @description: TODO
 * @date 2022/1/7 14:48
 */
public class DeepProtoType implements Serializable,Cloneable {

    public  String name;//属性
    public DeepCloneableTarget deepCloneableTarget;//引用类型

    public DeepProtoType() {
        super();
    }
    //深拷贝-方式1 使用clone


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完后对基本数据类型（属性）和String 的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }












}
