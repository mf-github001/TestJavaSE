package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 15:44
 */
public class Test {
    public static void main(String[] args) {
        //创建子线程对象：
        TestThread tt = new TestThread();
        Thread t = new Thread(tt,"子线程");//Thread()构造器可传入Runnable接口'对象'
        t.start();
        //主线程里面也是打印1-10数字：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
