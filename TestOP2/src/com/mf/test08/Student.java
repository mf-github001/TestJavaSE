package com.mf.test08;

/**
 * @Auther: mf
 * @Date: 2021/7/25 - 07 - 25 - 19:37
 */
public class Student extends Person {
    double score;

    public Student(){
        /*super();*/
    }

    public Student(double score){
        super();
        this.score=score;
    }
    public Student(int age,String name,double score){
        super(age,name);//利用super调用父类构造器
        /*this(score);*/
       /* this.age=age;
        this.name=name;*/
       /* super.age=age;
        super.name=name;*/
        //this.score=scorere;
        this.score=score;
    }
}
