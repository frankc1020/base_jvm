package com.guigu.designpattern.sevenprinciple.inversion.improve;

/**
 * @author admin
 * @title: DependencyPass
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/30 08:57
 */
public class DependencyPass {
    public static void main(String[] args) {
        //通过接口方式实现
        ChangHong changHong = new ChangHong();
//        OpenAndClose open = new OpenAndClose();
//        open.open(changHong);

        //通过构造器进行依赖传递
//        OpendAndClose openAndClose = new OpendAndClose(changHong);
//		openAndClose.open();

        //通过setter方式实现
        OpendAndClose opendAndClose = new OpendAndClose();
        opendAndClose.setTv(changHong);
        opendAndClose.open();
    }
}

//方式1： 通过接口传递实现依赖
//开关的接口
/*
interface IOpenAndClose{
    public void open(ITV tv);
}

interface ITV{//ITV接口
    public void play();
}

class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
*/

//方式2：通过构造方法依赖传递
/*interface IOpenAndClose{
    public void open();
}

interface ITV{//ITV接口
    public void play();
}
class OpendAndClose implements IOpenAndClose{
    public ITV tv;
    public OpendAndClose(ITV tv){
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}*/

//方法3：通过setter方法传递
interface IOpenAndClose{
    public void open();

    public void setTv(ITV tv);
}
interface ITV{//ITV接口
    public void play();
}

class OpendAndClose implements  IOpenAndClose{
    private ITV tv;
    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}

class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

