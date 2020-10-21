package com.guigu.se.j2se.data.struct;

import java.util.Arrays;

/**
 * @author admin
 * @title: BubbSortTest
 * @projectName base_thread
 * @description: 冒泡排序
 * @date 2020/10/20 09:18
 */
public class BubbSortTest {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,20};

        int temp = 0;
        boolean flag = false;//标识，如果一轮都没有交换，证明已经有序，则停止循环排序（冒泡的优化）
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if(!flag){
                System.out.println("数据已经有序了，停止了哦！");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
