package com.mf.test07;

/**
 * @Auther: mf
 * @Date: 2021/7/25 - 07 - 25 - 16:46
 */
public class Student extends Person{
    double score;
    int age=20;
    public void study(){
        System.out.println("学习");
    }
    public void eat(){
        System.out.println("干饭");

    }
    public void a(){
        System.out.println(age);//20
        System.out.println(this.age);//20
        System.out.println(super.age);//10
         eat();//子类
         this.eat();//子类
         super.eat();//父类
    }
}
