package com.mf.test07_;

import java.util.HashSet;

/**
 * @Auther: mf
 * @Date: 2022/11/13 - 11 - 13 - 15:01
 */
public class TestStudent {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建一个HashSet集合:
        HashSet<Student>hs=new HashSet<>();
        hs.add(new Student(19,"lili"));
        hs.add(new Student(19,"lili"));
        hs.add(new Student(18,"mimi"));
        hs.add(new Student(10,"lihua"));
        System.out.println(hs.size());
        System.out.println(hs);//本质上调用的是toString
        //[Student{年龄=18, 姓名='mimi'}, Student{年龄=19, 姓名='lili'}, Student{年龄=19, 姓名='lili'}, Student{年龄=10, 姓名='lihua'}]
        //输出结果不唯一
    }
}
