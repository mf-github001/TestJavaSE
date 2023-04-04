package com.mf.test01;
/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 14:49
 */
public class Test {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //给main方法这个主线程设置名字：
        //Thread.currentThread()作用获取当前正在执行的线程
        Thread.currentThread().setName("主线程");
        //主线程中也要输出十个数：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"1-------"+i);
        }
        //制造其他线程，要跟主线程争抢资源：
        //具体的线程对象：子线程
        TestThread tt = new TestThread("子线程");
        //tt.run();//调用run方法，想要执行线程中的任务 -->这个run方法不能直接调用，直接调用就会被当做一个普通方法
        //想要tt子线程真正起作用比如要启动线程：
        tt.start();//start()是Thread类中的方法
        //主线程中也要输出十个数：
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"2-------"+i);
        }
    }
}
