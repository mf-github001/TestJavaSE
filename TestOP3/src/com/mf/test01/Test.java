package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2021/8/3 - 08 - 03 - 18:55
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        //创建一个Student类的具体的实例:
        Student s=new Student("feifei",19,160.1);
        System.out.println(s/*.toString()*/);//输出结果:com.mf.test01.Student@1b6d3586
        System.out.println(s.toString());//输出结果:com.mf.test01.Student@1b6d3586
    }
}
