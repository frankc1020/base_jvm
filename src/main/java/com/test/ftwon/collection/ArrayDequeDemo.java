package com.test.ftwon.collection;

import java.util.PriorityQueue;

/**
 * @author admin
 * @title: ArrayDequeDemo
 * @projectName base_thread
 * @description: TODO
 * @date 2020/8/15 08:59
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        int initialCapacity = 10;
        int numElements = 10;
        // Find the best power of two to hold elements.
        // Tests "<=" because arrays aren't kept full.
       /* if (numElements >= initialCapacity) {
            initialCapacity = numElements;
            initialCapacity |= (initialCapacity >>> 1);
            initialCapacity |= (initialCapacity >>> 2);
            initialCapacity |= (initialCapacity >>> 4);
            initialCapacity |= (initialCapacity >>> 8);
            initialCapacity |= (initialCapacity >>> 16);
            initialCapacity++;
            if (initialCapacity < 0) // Too many elements, must back off
                initialCapacity >>>= 1;// Good luck allocating 2 ^ 30 elements
        }*/

        System.out.println(initialCapacity |= initialCapacity >>> 1); // a |= b  相当于  a = a|b
        System.out.println(Integer.toBinaryString(-1));
        String str = "11111111111111111111111111111111";
        System.out.println(str.length());

        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.toBinaryString(7));

        PriorityQueue priorityQueue = new PriorityQueue();



    }
}
