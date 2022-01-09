package com.guigu.se.j2se;

import com.guigu.se.j2se.reflect.Person;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//i=1
//        i = ++i;//i=2

        System.out.println(i);

        int j = i++;//j=1
        System.out.println(j);

        System.out.println(i);
        System.out.println(i + ++i * i++);
        System.out.println(i);
//        int k = i + ++i * i++;//k=11，i=4
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
    }
    @Test
    public  void strEqualTest(){
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2;
        System.out.println("str1 == str2 --> " + (str1==str2)) ;
        System.out.println("str1 == str3 --> " + (str1==str3)) ;
        System.out.println("str2 == str3 --> " + (str2==str3)) ;
    }

    /**
     * trim()方法过滤空格
     * 如果不过滤空格，那么开头结尾就是空格开头
     */
    @Test
    public void strTest(){

        String str = "    helloworld      ".trim();
        String str1 = "    helloworld     ";
        System.out.println(str) ;
        System.out.println(str.toUpperCase()) ;
        System.out.println(str.startsWith("hello")) ;
        System.out.println(str.endsWith("d")) ;
        System.out.println(str1.startsWith(" ")) ;
        System.out.println(str1.endsWith(" ")) ;
    }
    @Test
    public void lambdaTest(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };

        //Lambda表达式
        Runnable r2 = () -> System.out.println("Hello World");
        new Thread(r1).start();
        new Thread(r2).start();

    }
    @Test
    public void seTest(){
        /*System.out.println(10 / 3) ;
        // 整型在计算前会先向 float 转型
        System.out.println(10 / (float)3) ;*/

       /* int max = Integer.MAX_VALUE ;// 整型最大值
         int min = Integer.MIN_VALUE ;// 整型最小值
         System.out.println(max + 1) ;
         System.out.println(min - 1) ;*/

       /* if(1==2 & 10/0==0){ System.out.println("条件满足") ;
        }*/
        if(1==2 && 10/0==0){ System.out.println("条件满足") ;
        }else{
            System.out.println("条件不满足") ;
        }

    }

    /**
     * 基本运算之位运算
     */
    @Test
    public void baseTest(){
        int x = 45 ;
        int y = 10 ;
        System.out.println("x:" + Integer.toBinaryString(x));
        System.out.println("y:" + Integer.toBinaryString(y));
        System.out.println(x & y) ;
        System.out.println(x | y) ;
        System.out.println(x>>2) ;//移位操作
        System.out.println(x<<1) ;//移位操作
        System.out.println(x) ;
    }
    @Test
    public void StrTest(){
        /*StringBuffer sb = new StringBuffer();
        sb.append("Hello World!!!!");
        System.out.println(sb.replace(0, sb.length(), "XXX"));*/

        Runtime run = Runtime.getRuntime();
        System.out.println("取得当前空余的内存: "+run.freeMemory());
        System.out.println("总共可以使用的内存: "+run.totalMemory());
        System.out.println("取得最大可用的内存: "+run.maxMemory());
    }
    @Test
    public void DateTest(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date();
        String str = sdf.format(date);
        System.out.println("格式化后的日期:" + str);
    }
    @Test
    public void  shortTest(){
        try {
            short s1  = 1;
//            s1 = s1 +1;
//            s1 += 1;
            BigInteger bi = new BigInteger("50000000");
            System.out.println(5 << 3);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Test
    public void strReTest(){
        try {
            Person p = new Person();
            System.out.println(p.getName());
            String smsStr = "感谢您参与$ACTNAME#，您的$COUPONNAME#(兑换有效期截止{$MONTH#})已到账，快来特权中心使用吧 https://qy.chinaunicom.cn/cc【特权中心】";
            String sendValue = smsStr.replace("$ACTNAME#", null).replace("$COUPONNAME#", "").replace("{$MONTH#}", "");
            System.out.println(sendValue);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
