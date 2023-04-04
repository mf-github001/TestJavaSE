package com.mf.test06;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 19:35
 */
public class TestThread01 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
class TestThread02 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <= 30 ; i++) {
            System.out.println(i);
        }
    }
}
class Test{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建两个子线程，让这两个子线程争抢资源：
        TestThread01 t1 = new TestThread01();
        t1.setPriority(1);//设置优先级别高

        TestThread02 t2 = new TestThread02();
        t2.setPriority(10);//优先级别低

        t2.start();
        t1.start();
    }
}
