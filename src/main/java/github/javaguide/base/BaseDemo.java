package github.javaguide.base;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @title: BaseDemo
 * @projectName base_thread
 * @description: TODO
 * @date 2020/8/19 09:44
 * GitHub上的javaGuide项目中的Java基础测试
 */
public class BaseDemo {

    /**
     * Java泛型测试
     */
    @Test
    public void genericTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        //这里直接添加会报错
//        list.add("a");
        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
        //但是通过反射添加，是可以的
        add.invoke(list, "kl");

        System.out.println(list);
    }

    /**
     * 引用传递测试
     */
    @Test
    public void valueTest(){
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        swap(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }

    public static void swap(Student x, Student y) {
        String temp = x.getName();
        x.setName(y.getName());
        y.setName(temp);
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }

    /**
     * 浮点数测试
     */
    @Test
    public void test(){
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        System.out.println(a);// 0.100000024
        System.out.println(b);// 0.099999964
        System.out.println(a == b);// false

        BigDecimal a1 = new BigDecimal("1.0");
        BigDecimal b1= new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a1.subtract(b1);// 0.1
        BigDecimal y = b1.subtract(c);// 0.1
        System.out.println("a1:" + a1);
        System.out.println("b1:" + b1);
        System.out.println("c:" + c);
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println(x.equals(y));// true
    }
}
