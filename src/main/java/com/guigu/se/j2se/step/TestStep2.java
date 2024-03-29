package com.guigu.se.j2se.step;


import org.junit.jupiter.api.Test;

/**
 * 递归与迭代
 * 使用迭代实现
 */
public class TestStep2 {
    @Test
    public void test(){
        long start = System.currentTimeMillis();
        System.out.println(f(40));//165580141
        long end = System.currentTimeMillis();
        System.out.println(end - start);// <1ms  效率极大的提高
    }

    public int f(int n){
        if(n < 1){
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n==1 || n==2){
            return n;
        }
        int one = 2;//初始化为走到第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;
        for(int i = 3; i<=n; i++){
            //最后跨2步+最后跨1步的走法
            sum = two + one;
            two = one;
            one = sum;
        }
        return sum;

    }

    public static void main(String[] args) {

    }
}
