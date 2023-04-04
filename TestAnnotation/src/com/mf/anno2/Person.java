package com.mf.anno2;

/**
 * @version : 1.0
 */
public class Person {
    public void eat(){
        System.out.println("父类eat..");
    }
    /*
    在方法前加入@Deprecated，这个方法就会变成一个废弃方法/过期方法/过时方法
     */
    @Deprecated
    public void study(){
        System.out.println("学习。。");
    }
}

