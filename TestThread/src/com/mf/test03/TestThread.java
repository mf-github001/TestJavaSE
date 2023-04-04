package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 15:43
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        //输出1-10数字：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
    }
}
