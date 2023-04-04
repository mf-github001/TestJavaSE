package com.mf;
/**
 * @Auther: mf
 * @Date: 2021/7/22 - 07 - 22 - 10:21
 */
public class Student {
    byte b;
    short s;
    int c;//成员变量:在类中方法外
    long l;
    float f;
    double d;
    char ch;
    boolean bo;
    String name;//引用数据类型
    public void study(){
        int num=10;//局部变量：在方法中
        System.out.println(num);//10
        //int num;//重复命名,出错
        {
            int a;//局部变量,在代码块中
        }
        int a;//局部变量,在方法中
        if (1 == 3) {
            int b;//局部变量,在分支中
        }
        System.out.println(c);
    }
    public void eat(){
        System.out.println(c);
    }

    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Student s=new Student();//创建Student的一个具体对象s;Student属于引用数据类型;
        System.out.println(s.b);
        System.out.println(s.s);
        System.out.println(s.c);
        System.out.println(s.l);
        System.out.println(s.f);
        System.out.println(s.d);
        System.out.println(s.ch);
        System.out.println(s.bo);
        System.out.println(s.name);
        s.d=10.1;//对对象的属性进行赋值；
        System.out.println("d="+s.d);
    }
}
