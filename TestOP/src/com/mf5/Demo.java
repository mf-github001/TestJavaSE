package com.mf5;
/**
 * @Auther: mf
 * @Date: 2021/7/23 - 07 - 23 - 20:07
 */
public class Demo {
    int id;
    static int sid;
    public void a(){
        System.out.println(id);
        System.out.println(sid);
        System.out.println("-------a");
    }
    //1.static和public都是修饰符，而且是并列的，没有先后顺序，先写谁都行
     static public void b(){
         // 2.在静态的方法中不能访问非静态的属性
         // System.out.println(id);//出错
         // 3.在静态方法中不能访问非静态的方法
         // a();//出错
         //4.在静态方法中不能使用this关键字
         //System.out.println(this.id);//出错
         System.out.println(sid);
         System.out.println("-------b");
    }

    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //5.非静态的方法可以用 对象名.方法名 调用
        Demo d=new Demo();//创建类中的一个具体的对象 d;
        d.a();
        //6.静态的方法可以用 对象名.方法名 调用
        //         也可以用  类名.方法名 调用(推荐)
        Demo.b();
        d.b();

        //在同一个类中,可以直接调用
        b();
    }
}