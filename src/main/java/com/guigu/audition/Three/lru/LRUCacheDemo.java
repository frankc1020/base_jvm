package com.guigu.audition.Three.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author admin
 * @title: LRUCacheDemo
 * @projectName base_thread
 * @description: TODO
 * @date 2021/7/23 13:19
 */
public class LRUCacheDemo<K,V> extends LinkedHashMap<K,V> {

    private int capacity;//缓存坑位

    /**
     *  accessOrder     the ordering mode - <tt>true</tt> for
     *  access-order, <tt>false</tt> for insertion-order
     * @param capacity
     */
    public LRUCacheDemo(int capacity){
        super(capacity,0.75F,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > capacity;
    }

    public static void main(String[] args) {
        LRUCacheDemo lruCacheDemo = new LRUCacheDemo(3);

        lruCacheDemo.put(1,"a");
        lruCacheDemo.put(2,"b");
        lruCacheDemo.put(3,"c");

        System.out.println(lruCacheDemo.keySet());
        lruCacheDemo.put(4,"d");
        System.out.println(lruCacheDemo.keySet());

        lruCacheDemo.put(3,"c");
        System.out.println(lruCacheDemo.keySet());
        lruCacheDemo.put(3,"c");
        System.out.println(lruCacheDemo.keySet());
        lruCacheDemo.put(3,"c");
        System.out.println(lruCacheDemo.keySet());
        lruCacheDemo.put(5,"x");
        System.out.println(lruCacheDemo.keySet());
        lruCacheDemo.put(3,"c");
        System.out.println(lruCacheDemo.keySet());
        lruCacheDemo.put(6,"g");
        System.out.println(lruCacheDemo.keySet());

    }
}
/**
 * accessOrder = true
 * 当accessOrder 为true时，首先判断有没有重复的key，有重复key
 * 则将前面的key移除，然后插入最后面
 * [1, 2, 3]
 [2, 3, 4]
 [2, 4, 3]
 [2, 4, 3]
 [2, 4, 3]
 [4, 3, 5]
 [4, 5, 3]
 [5, 3, 6]
 * */

/**
 * accessOrder = false
 * 当accessOrder 为false时，首先判断有没有重复的key，有重复key
 * 则将不会改变，没有则直接插入在最后面
 * [1, 2, 3]
 [2, 3, 4]
 [2, 3, 4]
 [2, 3, 4]
 [2, 3, 4]
 [3, 4, 5]
 [3, 4, 5]
 [4, 5, 6]
 * */