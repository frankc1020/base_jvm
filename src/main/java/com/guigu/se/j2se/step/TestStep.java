package com.guigu.se.j2se.step;


import org.junit.jupiter.api.Test;

/**
 * 递归与迭代
 * 使用递归实现
 */
public class TestStep {
    @Test
    public void test(){
        long start = System.currentTimeMillis();
        System.out.println(f(40));//165580141
        long end = System.currentTimeMillis();
        System.out.println(end - start);//     353
    }
    /**
     * 实现f(n):求n步台阶，一共几种走法
     * @param n
     * @return
     */
    public int f(int n){
        if(n < 1){
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if(n==1 || n==2){
            return n;
        }
        return f(n-2) + f(n-1);
    }

    public static void main(String[] args) {

    }
}
