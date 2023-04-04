package com.mf.anno2;

/**
 * @Auther: mf
 * @Date: 2022/12/8 - 12 - 08 - 1:23
 */
public class Student extends Person {
    /*
   @Override的作用：限定重写的方法，只要重写方法有问题，就有错误提示。
    */
    @Override
    public void eat(){
        System.out.println("子类eat..");
    }
}
