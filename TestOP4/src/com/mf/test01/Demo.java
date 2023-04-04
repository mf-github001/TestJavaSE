package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2021/8/5 - 08 - 05 - 15:10
 */
public class Demo {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Pig p =new Pig();
        Animal an=p;//转型:向上转型
        an.shout();
        //加入转型代码：
        //将Animal转为Pig类型:
        Pig pig=(Pig)an;//转型:向下转型
        pig.eat();
        pig.age=10;
        pig.weight=60.5;

        Animal an2=new Dog();
        //转型代码:
        Dog dog=(Dog)an2; //父类转为子类,向下转型
        dog.shout();
        dog.age=10;
        dog.name="大黄";
        dog.longs=1;
        dog.guard();
    }
}
