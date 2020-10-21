package github.javaguide.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author admin
 * @title: MapDemo
 * @projectName base_thread
 * @description: TODO
 * @date 2020/10/14 15:44
 */
public class MapDemo {

    static  String key;
    static  String value;

    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        map.put("key","key1");
//        key = "key";
//        value="abcdre";
//        System.out.println(hash("key")%16);
//        System.out.println(hash("key"));
//        int n = 15&hash("key");
//        System.out.println(n);
//        System.out.println(key.hashCode());
//        System.out.println(key.hashCode() >>> 16);

        // 创建并赋值 HashMap
        Map<Integer, String> map = new HashMap();
        map.put(1, "Java");
        map.put(2, "JDK");
        map.put(3, "Spring Framework");
        map.put(4, "MyBatis framework");
        map.put(5, "Java中文社群");
        // 遍历
        map.forEach((key, value) -> {
            System.out.print(key);
            System.out.print(value);
        });
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public   int hashCode() {
        return Objects.hashCode(key) ^ Objects.hashCode(value);
    }

}
