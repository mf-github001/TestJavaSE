package com.mf.test07;

/**
 * 1.类的组成:属性,方法,构造器,代码块(普通块,静态块,构造块,同步块),内部类
 * 2.一个类TestOuter的内部的类SubTest叫内部类---->内部类:SubTest 外部类:TestOuter
 * 3.内部类:成员内部类(静态的,非静态的) 和局部内部类(位置:方法内,块内,构造器内)
 * 4.成员内部类:
 *        里面属性,方法,构造器等
 *        修饰符:private,default,protect,public,fianl,abstract
 */
public class TestOuter {
    //非静态的成员内部类:
    class D{
        String name;
        int age=20;
        public void method(){
            //5.内部类可以访问外部类的内容
            /*System.out.println(age);
            a();*/

            int age=30;
            //8.内部类和外部类属性重名的时候,如何进行调用:
            System.out.println(age);//方法中的age  30
            System.out.println(this.age);//该类中的age 20
            System.out.println(TestOuter.this.age);//外部类中的age  10
        }

    }
    //静态成员内部类:
    static class E{
        public void method(){
            //6.静态内部类中只能访问外部类中被static修饰的内容
           // System.out.println(age);//出错
           // a();//出错
            System.out.println(height);
        }
    }
    //属性:
    int age=10;
    static double height;
    //方法:
    public void a(){
        System.out.println("这是a方法");
        {
            System.out.println("这是一个普通块");

            class B{
            }
        }
        class A{

        }
        //7.外部类想要访问内部类的东西，需要创建内部类的对象然后进行调用
        //System.out.println(Name);外部类中不能直接调用内部类的内容
        D d=new D();//创建内部类的对象
        System.out.println(d.name);
        d.method();
    }

    static{
        System.out.println("这是静态块");
    }

    {
        System.out.println("这是构造块");
    }
    //构造器:
    public TestOuter() {
    }

    public TestOuter(int age) {
        this.age = age;
    }
    //代码块:


}
class Demo{
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建外部类的对象:
        TestOuter to=new TestOuter();
        to.a();

        //9.创建内部类的对象:
        //静态的成员内部类创建对象:
        TestOuter.E e =new TestOuter.E();
        //非静态的成员内部类创建对象:
        //TestOuter.D d =new TestOuter.D();//出错
       TestOuter t=new TestOuter();
        TestOuter.D d=t.new D();
    }
}
