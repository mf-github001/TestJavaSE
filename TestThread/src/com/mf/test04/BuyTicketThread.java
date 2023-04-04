package com.mf.test04;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 19:06
 */
public class BuyTicketThread implements Runnable {
    /*    int ticketNum = 10;
        @Override
        public void run() {
            for (int i = 1; i <= 100 ; i++) {
                if(ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+"买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }
        }*/
    int ticketNum = 10;
    @Override
    public void run() {
        //此处有1000行代码
        for (int i = 1; i <= 100 ; i++) {
            synchronized (this){//把具有安全隐患的代码锁住即可，如果锁多了就会效率低 --》this就是这个锁
                if(ticketNum > 0){
                    System.out.println("我在"+Thread.currentThread().getName()+
                                "买到了北京到哈尔滨的第" + ticketNum-- + "张车票");
                }
            }
        }
        //此处有1000行代码
    }
}