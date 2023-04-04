package com.mf.test06;

import com.mf.test05.A;

/**
 * @Auther: mf
 * @Date: 2021/7/25 - 07 - 25 - 10:30
 */
public  class B extends A {
    public void e(int a){
        System.out.println(age);
       // sno=32;//private
        //height=100;//default
        age=a;//protected
        name="lili";//public修饰
        System.out.println(name);
    }

    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        B a=new B();
        System.out.println(1+1);
            a.e(10);

    }
}
