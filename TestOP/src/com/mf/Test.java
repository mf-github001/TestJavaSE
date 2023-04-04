package com.mf;

/**
 * @Auther: mf
 * @Date: 2021/7/22 - 07 - 22 - 8:44
 */
public class Test {//测试类

    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
      //创建一个人类的具体对象/实例:
      //创建一个对象,对象的名字叫:zs
      //person 属于 引用数据类型:
      //第一次加载类的时候,会进行类的加载,初始化创建对象的时候,对象的属性没有赋值,有默认的初始化的值.
        Person zs=new Person();
        zs.name="张三";
        zs.age=19;
        zs.height=190.1;
        zs.weight=170.4;
        //再创建一个对象:
        //再次创建的时候,就不会进行类的加载了,类的加载只在第一次需要的时候加载一次
        Person ls=new Person();
        ls.name="李四";
        ls.age=18;
        ls.height=173.0;
        ls.weight=60;
        //对属性值进行读取:
        System.out.println(zs.name);
        System.out.println(ls.age);
        //对方法进行操作:
        //不同的对象,属性有自己的特有的值,但是方法都是调用类中通用的方法.
        //属性:各个对象的属性是独立的.
        //方法:各个对象的方法是共享的.
        zs.eat();
        ls.eat();
        zs.sleep("卧室");
       /* String str=zs.introduce();//自我介绍
        System.out.println("张三"+'\n'+str);*/
        System.out.println("张三"+'\n'+zs.introduce());
    }
}
