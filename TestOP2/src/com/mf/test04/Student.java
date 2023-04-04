package com.mf.test04;

/**
 * @Auther: mf
 * @Date: 2021/7/25 - 07 - 25 - 11:27
 */
public class Student extends Person {
    public void study(){
        System.out.println("学习");
    }
    public void eat(){
        System.out.println("吃牛肉面");
    }
    protected void run(){
        System.out.println("跑步" );
    }
}
