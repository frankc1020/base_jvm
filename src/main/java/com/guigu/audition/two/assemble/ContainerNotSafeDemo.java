package com.guigu.audition.two.assemble;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合类不安全的问题
 * ArrayList
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        Map<String,String> map = Collections.synchronizedMap(new HashMap<>());
        /*Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));
                System.out.println(map);
            },String.valueOf(i)).start();
        }*/

        listNotSafe();
    }

    /**
     * set不安全线程相关讲解
     */
    public static void setNotSafe(){
        //        Set<String> set = new HashSet<>();
//        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Set<String> set = new CopyOnWriteArraySet();
        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
        /**
         * HashSet底层是HashMap
         * 如下是hashSet的add方法
         public boolean add(E e) {
         return map.put(e, PRESENT)==null;
         }
         * HashSet的add方法是把传入的值放在HashMap的key的地方，value的地方放的是一个常量对象
         * new HashSet<>().add("a");
         */
    }

    /**
     * list相关的线程不安全的知识讲解
     */
    public static void listNotSafe(){
      //        List<String> list = Arrays.asList("a", "b", "c");
//        list.forEach(System.out::println);

//        List<String> list = new ArrayList<>();//线程不安全
//        List<String> list = new Vector<>();//线程安全
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();
        /*list.add("a");
        list.add("b");
        list.add("c");

        for (String B: list) {
            System.out.println(B);
        }
*/

        for (int i = 1; i <=30 ; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
        //java.util.ConcurrentModificationException 并发修改异常
        /**
         *  不要只是会用，会用只不过是一个API调用工程师
         *  底层原理
         * 1. 故障现象
         *      java.util.ConcurrentModificationException
         *
         * 2. 导致原因
         *     并发争抢修改导致，参考花名册签名情况
         *     一个人正在写入，另一个同学过来抢夺，导致数据不一致异常。即并发修改异常
         *
         * 3. 解决方案
         *    3.1 new Vector()使用Vector集合
         *    3.2 Collections.synchronizedList(new ArrayList<>())
         *    3.3 new CopyOnWriteArrayList()
         *
         * 4. 优化建议（同样的错误不犯第二次）
         */


        /**
         *
         *   写时复制 
         *   copyOnWrite  容器即写时复制的容器 往容器添加元素的时候 , 不直接往当前容器 object[] 添加 , 而是先将当前容器 object[] 进行      
         *   copy  复制出一个新的 object[] newElements  然后向新容器 object[] newElements  里面添加元素 添加元素后 ,     
         *   再将原容器的引用指向新的容器  setArray(newElements);     
         *    这样的好处是可以对 copyOnWrite 容器进行并发的读 , 而不需要加锁 因为当前容器不会添加任何容器 . 所以 copyOnwrite 容器也是一种      
         *    读写分离的思想 , 读和写不同的容器
         *
         *    public boolean add(E e) {
         final ReentrantLock lock = this.lock;
         lock.lock();
         try {
         Object[] elements = getArray();
         int len = elements.length;
         Object[] newElements = Arrays.copyOf(elements, len + 1);
         newElements[len] = e;
         setArray(newElements);
         return true;
         } finally {
         lock.unlock();
         }
         }
         *
         */
    }

}
