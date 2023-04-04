package com.mf.test11;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 21:27
 */
public class CustomerThread extends Thread{//消费者线程
    //共享商品：
    private Product p;
    public CustomerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//i:消费次数
            p.getProduct();;
        }
    }
}
