package com.mf.test10;

/**
 * @Auther: mf
 * @Date: 2021/8/3 - 08 - 03 - 0:30
 */
public class Student extends Person {
    double height;
    public Student(){
    }
    public Student(int age,String name,double height){
        super(age,name);
        this.height=height;
    }
}
