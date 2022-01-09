package com.guigu.designpattern.designmodel.prototype.deepclone;

import java.io.Serializable;

/**
 * @author admin
 * @title: DeepCloneableTarget
 * @projectName base_thread
 * @description: TODO
 * @date 2022/1/7 14:43
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
    //因为该类的属性，都是String，因此我们这里使用默认的Clone 完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
