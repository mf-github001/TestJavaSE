package com.mf.test2;

/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 22:25
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建一个Student对象:
        Student s1=new Student();//创建类下面的一个具体的对象
        s1.setName("xmlll");
        s1.setAge(18);
        s1.setSex("女");
        System.out.println(s1.getName()+'\t'+s1.getAge()+'\t'+s1.getSex());

        Student s2 =new Student(18,"墨风","161631");
        System.out.println(s2.getName()+'\t'+s2.getAge()+'\t'+s2.getSex());
    }
}
