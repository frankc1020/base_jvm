package com.guigu.designpattern.sevenprinciple.liskov;

/**
 * @author admin
 * @title: Liskov
 * @projectName base_thread
 * @description: 里氏替换原则
 * @date 2020/8/18 10:44
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-8="+a.fun1(1,8));

        System.out.println("--------------------------");
        B b = new B();
        System.out.println("11-3="+b.fun1(11,3));//本意是求出11-3，实际是B类进行重载算成11+3
        System.out.println("1-8="+b.fun1(1,8));//1-8
        System.out.println("11+3+9="+b.fun2(11,3));
    }
}
class A{
    public int fun1(int a,int b){
        return a  -b;
    }
}

class B extends A{
    @Override
    public int fun1(int a, int b) {
        return a + b;
    }
    public int fun2(int a, int b) {
        return fun1(a,b)+9;
    }
}
