package com.guigu.audition.two.sync;
import java.util.concurrent.CountDownLatch;
/**
 * CountDownLatch，是控制某个线程在最后执行，只有当前面的线程
 * 执行完毕，才可以往下进行执行
 *
 * countDownLatch 是多个线程允许阻塞在一个地方，直至所有的线程的任务都执行完毕。
 *
 *
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6 ; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 国，被灭");
                countDownLatch.countDown();
                System.out.println("jggjh");
            },CountryEnum.forEach_CountryEnum(i).getRetMessage()).start();
        }
        countDownLatch.await();//只用当countDownLatch减到0的时候才可以
        System.out.println(Thread.currentThread().getName() + "\t*******************秦帝国一统华夏！！！");
    }
    public static void closeDoor() throws InterruptedException  {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6 ; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 上完自习，离开教室");
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        countDownLatch.await();//只用当countDownLatch减到0的时候才可以
        System.out.println(Thread.currentThread().getName() + "\t*******************888班长最后关门走人");
    }
}
