package com.mf.test05;

/**
 * @Auther: mf
 * @Date: 2021/8/7 - 08 - 07 - 1:33
 */
public interface TestInterface {
    //常量：
    public static final int NUM=10;
    //抽象方法:
    public abstract void a();
    //public default 修饰的抽象方法:
    public default void b(){
        System.out.println("---TestInterface---b()----");
    }
}
class Test implements TestInterface{
    public void c(){
       //用一下接口中的b方法:
        b();//可以
        //super.b();//不可以
        TestInterface.super.b();//可以
    }
    @Override
    public void a() {
        System.out.println("重写了a方法");
    }

    @Override
    public void b() {

    }
}