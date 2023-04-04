package com.mf.test09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 20:35
 */
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;
    //拿来一把锁：
    Lock lock = new ReentrantLock();//多态  接口=实现类  可以使用不同的实现类
    @Override
    public void run() {
        //此处有1000行代码
        for (int i = 1; i <= 100 ; i++) {
            //打开锁：
            lock.lock();
            try{
                if(ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()
                            +"买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }finally {
                //关闭锁：--->即使有异常，这个锁也可以得到释放
                lock.unlock();
            }
        }
        //此处有1000行代码
    }
}