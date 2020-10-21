package com.guigu.se.j2se.data.struct;

import java.util.Arrays;

/**
 * @author admin
 * @title: SelectSortTest
 * @projectName base_thread
 * @description: 选择排序
 * @date 2020/10/20 10:26
 */
public class SelectSortTest {
    public static void main(String[] args) {
        int[] arr = {3,9,-1,10,20};

        int min;
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            //先假定当前这个数是最小的
            min = arr[i];
            minIndex = i;
            for (int j = i+1; j < arr.length - 1; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){//当最小的数不是假定的最小的数的时候，进行交换
                 arr[minIndex] = arr[i];
                 arr[i] = min;
            }
            System.out.print("第"+(i+1)+"轮排序： ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
