package com.guigu.designpattern.designmodel.jdk.source;

import java.util.Calendar;

/**
 * @author admin
 * @title: Factory
 * @projectName base_thread
 * @description: TODO
 * @date 2021/12/27 09:25
 */
public class Factory {
    public static void main(String[] args) {
        //getInstance 是Calendar 静态方法
        Calendar cal = Calendar.getInstance();
        //注意月份下标0开始，所以取月份要+1
        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));
    }
}
