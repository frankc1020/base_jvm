package github.javaguide.collection;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author admin
 * @title: TestCollectionDemno
 * @projectName base_thread
 * @description: TODO
 * @date 2020/9/4 17:06
 */
public class TestCollectionDemno {

    /**
     * binarySearch()
     */
    @Test
    public void test3(){
        // *************查找 binarySearch()****************
        char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
        // 排序后再进行二分查找，否则找不到
        Arrays.sort(e);
        System.out.println("Arrays.sort(e)" + Arrays.toString(e));
        System.out.println("Arrays.binarySearch(e, 'c')：");
        int s = Arrays.binarySearch(e, 'c');
        System.out.println("字符c在数组的位置：" + s);
    }

    /**
     * sort()
     */
    @Test
    public void test2(){
        int a[] = { 1, 3, 2, 7, 6, 5, 4, 9 };
        // sort(int[] a)方法按照数字顺序排列指定的数组。
        Arrays.sort(a);
        System.out.println("a:"+Arrays.toString(a));
        Arrays.stream(a)
                .forEach(System.out::print);
        // 换行
        System.out.println("===========================");


        // sort(int[] a,int fromIndex,int toIndex)按升序排列数组的指定范围
        int b[] = { 2, 3, 9, 7, 6, 5, 4, 1 };
        Arrays.sort(b, 3, 6);
        System.out.println("Arrays.sort(b, 2, 6):");
        for (int i : b) {
            System.out.print(i);
        }
        System.out.println("----------------------------");

        String[] strs = { "abcdehg", "abcdefg", "abcdeag" };
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));//[abcdeag, abcdefg, abcdehg]
    }
    /**
     * emptyList,singletonList,unmodifiableList
     * 所创建的对象之所以不可以改变，是因为接收入参的对象都是用final修饰
     */
    @Test
    public void test1(){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        Map scores = new HashMap();
        scores.put("语文" , 80);
        scores.put("Java" , 82);

        //Collections.emptyXXX();创建一个空的、不可改变的XXX对象
        List<Object> list = Collections.emptyList();
        System.out.println(list);//[]
        Set<Object> objects = Collections.emptySet();
        System.out.println(objects);//[]
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        System.out.println(objectObjectMap);//{}

        //Collections.singletonXXX();
        List<ArrayList<Integer>> arrayLists = Collections.singletonList(arrayList);
        System.out.println(arrayLists);
        //创建一个只有一个元素，且不可改变的Set对象
        Set<ArrayList<Integer>> singleton = Collections.singleton(arrayList);
        System.out.println(singleton);//[[-1, 3, 3, -5, 7, 4, -9, -7]]
        Map<String, String> nihao = Collections.singletonMap("1", "nihao");
        System.out.println(nihao);//{1=nihao}

        //unmodifiableXXX();创建普通XXX对象对应的不可变版本
        List<Integer> integers = Collections.unmodifiableList(arrayList);
        System.out.println(integers);//[-1, 3, 3, -5, 7, 4, -9, -7]
        Set<Integer> integers2 = Collections.unmodifiableSet(integers1);
        System.out.println(integers2);//[1, 2, 3]
        Map<Object, Object> objectObjectMap2 = Collections.unmodifiableMap(scores);
        System.out.println(objectObjectMap2);//{Java=82, 语文=80}
    }

}
