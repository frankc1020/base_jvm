package com.guigu.designpattern.sevenprinciple.inversion.improve;

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

        WeiXin weiXin = new WeiXin();
        person.receive(weiXin);
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件：hello,world!";
    }
}

class WeiXin implements IReceiver{
    @Override
    public String getInfo() {
        return "微信：hello,world!";
    }
}

class Person{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
