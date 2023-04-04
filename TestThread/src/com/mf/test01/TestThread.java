package com.mf.test01;
/** @Auther: mf
 *  @Date: 2022/11/30 - 11 - 30 - 14:49
 * 线程类叫：TestThread，不是说你名字中带线程单词你就具备多线程能力了（争抢资源能力）
 * 现在想要具备能力，继承一个类：Thread，具备了争抢资源的能力*/
public class TestThread extends Thread{
    public TestThread(String name){
        super(name);//调用父类的有参构造器
    }
 /*   一会线程对象就要开始争抢资源了，这个线程要执行的任务到底是啥？这个任务你要放在方法中
    但是这个方法不能是随便写的一个方法，必须是重写Thread类中的run方法
    然后线程的任务/逻辑写在run方法中*/
    @Override
    public void run() {
        //输出1-10
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(this.getName()+i);
        }
    }
}

