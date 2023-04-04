package com.mf.test09;

/**
 * @Auther: mf
 * @Date: 2021/7/25 - 07 - 25 - 20:11
 */
public class Student extends Person {
    double height;
    double weight;

    public Student() {
    }

    public Student(String name, int age, double height, double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;
    }

}
