package com.mf5;
/**
 * @Auther: mf
 * @Date: 2021/7/23 - 07 - 23 - 17:50
 */
public class Student {
    //属性:
    String name;
    int age;
    static String school;
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Student.school="北京大学";//共享属性
        //创建学生对象:
        Student s1=new Student();
        s1.name="张三";
        s1.age=19;
        //s1.school="北京大学";

        Student s2=new Student();
        s2.name="李四";
        s2.age=20;
        //s2.school="北京大学";
        System.out.println(s2.school);
    }
}