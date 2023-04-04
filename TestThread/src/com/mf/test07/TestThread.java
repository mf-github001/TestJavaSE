package com.mf.test07;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 19:42
 */
public class TestThread extends Thread {
    public TestThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(this.getName()+"----"+i);
        }
    }
}
class Test{
    //这是main方法，程序的入口
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("main-----"+i);
            if(i == 6){//运行到6,启动子线程
                //创建子线程：
                TestThread tt = new TestThread("子线程");
                tt.start();
                tt.join();//“半路杀出个程咬金”
            }
        }
    }
}
