package github.javaguide.base;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
}
