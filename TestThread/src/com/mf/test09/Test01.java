package com.mf.test09;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 20:37
 */
public class Test01 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //定义一个线程对象：
        BuyTicketThread t = new BuyTicketThread();
        //三个窗口公用一个线程对象
        //窗口1买票：
        Thread t1 = new Thread(t,"窗口1");
        t1.start();
        //窗口2买票：
        Thread t2 = new Thread(t,"窗口2");
        t2.start();
        //窗口3买票：
        Thread t3 = new Thread(t,"窗口3");
        t3.start();
    }
}
