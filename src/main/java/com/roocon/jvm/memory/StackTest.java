package com.roocon.jvm.memory;
/**
 * 
 *使用递归调用模拟实现StackOverflowError错误
 *即栈内存溢出
 */
public class StackTest {

	private void test() {
		System.out.println("方法正在执行。。。。。");
		test();
	}	
	public static void main(String[] args) {
		new StackTest().test();
	}
}
