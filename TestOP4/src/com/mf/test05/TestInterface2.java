package com.mf.test05;

/**
 * @Auther: mf
 * @Date: 2021/8/7 - 08 - 07 - 1:53
 */
public interface TestInterface2 {
    //常量:
    public static final int NUM=10;

    //抽象方法:
    public abstract void a();

    //public default非抽象方法:
    public default void b(){
        System.out.println("-----TestInterface02----b");
    }

    //静态方法:
    public static void  c(){
        System.out.println("TestInterface2中的静态方法");
    }
}

//实现类:
class Demo implements TestInterface2{
    @Override
    public void a() {
        System.out.println("重写了a方法");
    }
    public static void c(){
        System.out.println("Demo中的静态方法");
    }
}
//测试类:
class A{
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Demo d=new Demo();
        d.c();
        Demo.c();
        TestInterface2.c();
    }
}
