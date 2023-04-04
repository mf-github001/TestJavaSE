package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2021/8/5 - 08 - 05 - 19:06
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //第一种情况:
        //final修饰一个变量,变量的值不可以改变,这个变量也变成了一个字符常量,约定俗称的规定:名字大写
        final int A=10;//final修饰基本数据类型
        //A=20;//报错:不可以修改值;
        //第二种情况:
       final Dog d=new Dog();//final修饰引用数据类型,那么地址值就不可以改变
        //d=new Dog();---->地址值不能更该;
        //d对象的属性依然可以改变:
        d. age=10;
        d.weight=20;

        //第三种情况:
        final Dog d2=new Dog();
        a(d2);
        //第四种情况:
        b(d2);

    }
    public static void a(Dog d){
        d=new Dog();//改变的是堆空间中的地址值;
    }
    public static void b(final Dog d){//d被final修饰,地址指向不可以改变
        //d=new Dog();
    }
}
