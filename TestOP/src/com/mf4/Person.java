package com.mf4;
/**
 * @Auther: mf
 * @Date: 2021/7/23 - 07 - 23 - 11:20
 */
public class Person {
    //属性
    int age;
    String name;
    double height;
    //空构造器
    public Person(){

    }
    //有参构造器
    public Person(int age,String name,double height){
        //注意:this修饰构造器必须放在第一行
       this(age,name);//构造器可以用this相互调用
       this. height=height;
    }
    public Person(int age,String name){
        this(age);
       this. name=name;
    }
    public Person(int age){
        this.age=age;
    }
    //方法:
    public void eat(){
        int age=10;
        System.out.println(age);//就近原则:age指的是离它近的age--->局部变量的age
        System.out.println(this.age);//这里指代的就是属性的age
        System.out.println("我要吃饭");
    }
    public void play(){
         /*this.*/tea();//在同个类中,方法可以相互调用,this.可以省略不写
        System.out.println("散步");
        System.out.println("吃饭");

    }
    public void tea(){
        System.out.println(/*this.*/age);//不发生重名时,访问属性时this.也可以省略不写
        System.out.println("喝茶");
    }
}
