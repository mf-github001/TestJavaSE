package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2022/12/20 - 12 - 20 - 7:47
 */
public class Student1 extends Person {
    //属性：
    private int sno;//学号
    double height;//身高
    protected double weight;//体重
    public double score;//成绩
    //方法：
    public String showInfo(){
        return "我是一名三好学生";
    }
    private void work(){
        System.out.println("我以后会找工作--》成为码农  程序员 程序猿  程序媛");
    }
    //构造器
    public Student1(){
        System.out.println("空参构造器");
    }
    private Student1(int sno){
        this.sno = sno;
    }
    Student1(int sno, double weight){
        this.sno = sno;
        this.weight = weight;
    }
}