package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2021/8/5 - 08 - 05 - 19:42
 */
final public class Person {//final和public属于并列关系，谁前谁后都可以。
    /*final*/public void eat(){
        System.out.println("人生大事，干饭");
    }

    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Math.abs(10);
    }
}

/*
class Student extends Person{
    @Override
    public void eat() {
        super.eat();
    }
}
*/
