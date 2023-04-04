package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 15:38
 */
public class Test {
    public static void main(String[] args) {
        //多个窗口抢票：三个窗口三个线程对象：

        BuyTicketThread t1 = new BuyTicketThread("窗口1");
        t1.start();
        BuyTicketThread t2 = new BuyTicketThread("窗口2");
        t2.start();
        BuyTicketThread t3 = new BuyTicketThread("窗口3");
        t3.start();

    }
}