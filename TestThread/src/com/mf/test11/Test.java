package com.mf.test11;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 21:28
 */
public class Test {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //共享的商品：
        Product p = new Product();
        //创建生产者和消费者线程：
        ProducerThread pt = new ProducerThread(p);
        CustomerThread ct = new CustomerThread(p);
        pt.start();
        ct.start();
    }
}