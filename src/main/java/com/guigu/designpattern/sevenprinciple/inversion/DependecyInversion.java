package com.guigu.designpattern.sevenprinciple.inversion;

/**
 * @author admin
 * @title: DependecyInversion
 * @projectName base_java
 * @description: TODO
 * @date 2020/7/30 08:43
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Email email = new Email();
        Person person = new Person();
        person.receive(email);
    }
}

class Email{
    public String getInfo(){
        return "电子邮件：hello,world!";
    }
}
//完成Person接收消息的功能
//方式1分析
//1.简单，比较容易想到
//2.如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接收方法
//3.解决思路：引入一个抽象的接口IReceiver，标识接收者，这样Person类与接口IReceiver发生依赖
// 因为Email,WeiXin 等等属于接收的范围，他们各自实现IReceiver，接口就ok，这样我们就符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
