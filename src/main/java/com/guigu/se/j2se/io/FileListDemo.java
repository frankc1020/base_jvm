package com.guigu.se.j2se.io;

import com.guigu.se.j2se.reflect.Person;
import org.junit.Test;

import java.io.*;

/**
 * @author admin
 * @title: FileListDemo
 * @projectName base_java
 * @description: TODO
 * @date 2020/5/28 15:14
 */
public class FileListDemo {

    public static void list(File file){
        if(file.isDirectory()){
            File f[] = file.listFiles();
            if(f != null){
                for(int x=0;x<f.length;x++){
                    list(f[x]);
                }
            }
        }
        System.out.println(file);

    }

    public static void main(String[] args) {
        File file = new File("/Users/guzhaocong/Documents");
        list(file);
    }

    @Test
    public void outPutTest()throws Exception{
        File file = new File("/Users/guzhaocong/Documents/test/temp.txt");
        OutputStream out = new FileOutputStream(file,true);
        String str = "Hello World!!!\r\n";
        byte data[] = str.getBytes();
        out.write(data);
        out.close();
    }
    @Test
    public void inPutTest()throws Exception{
        File file = new File("/Users/guzhaocong/Documents/test/temp.txt");
        InputStream in = new FileInputStream(file);
        byte data[] = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));

    }

    /**
     * 序列化
     * @throws Exception
     */
    @Test
    public void outPutSer()throws Exception{
        Person per =new Person("张三",30);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                new File("/Users/guzhaocong/Documents/test/person.ini")));
        oos.writeObject(per); // 序列化对象
        oos.close();
    }

    /**
     * 反序列化
     * @throws Exception
     */
    @Test
    public void inPutSer()throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("/Users/guzhaocong/Documents/test/person.ini")));
        Object obj = ois.readObject();
        ois.close();
        if (obj instanceof Person) {
            Person per = (Person) obj;
            System.out.println(per); }

    }

}
