package com.mf6;
/**
 * @Auther: mf
 * @Date: 2021/7/23 - 07 - 23 - 20:43
 */
public class Test {
    //属性
    int a;
    static int sa;

    //方法
    public void a(){
        System.out.println("a----b");
        {
            //普通代码块,限制了局部变量的作用范围
            System.out.println("这是普通块");
           // System.out.println("------00000");
            int num=10;
            System.out.println(num);
        }
        //System.out.println(num);//出错
        //if(){}
        //while(){}
    }
    //静态方法
    public static void b(){
        System.out.println("静态方法b");
    }
    //构造块(在方法外)
    {
        System.out.println("这是构造块");
    }
    //静态块
    static{
        System.out.println("这是静态块");
        //在静态块中只能访问:静态属性,静态方法;
        System.out.println(sa);
    }


    //构造器
    //空构造器
    public Test(){
        System.out.println("这是空构造器");
    }
    //有参构造器
    public Test(int a){
        this.a=a;
    }

    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建对象,调用方法,
        Test t=new Test();
        t.a();
        System.out.println("---------分界线--------------");
        Test t2  =new Test();
        t2.a();
    }
}
