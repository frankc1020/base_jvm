package com.roocon.jvm.memory;

public class StrTest {

	public static void main(String[] args) {
		String s1 = "abc";//直接创建放入常量池中
		String s2 = "abc";//直接创建从常量池中引用
		
		System.out.println(s1 == s2);//true
		
		String s3 = new String("abc");//在堆内存中创建，常量表中引用
		
		System.out.println(s1 == s3);//false
		
		//intern() 可以把创建的对象放入常量池中，也可以称之为运行时常量
		System.out.println(s1 == s3.intern()); //true
	}
}
