package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2021/8/4 - 08 - 04 - 20:07
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建Phone类的对象:
        Phone p1=new Phone("小米30",19999,2030);
        Phone p2=new Phone("小米30",19999,2030);
        //比较两个对象:p1和p2对象:
        //==的作用:比较左右两侧的值是否相等,要么相等,返回true,要么不等,返回false
        System.out.println(p1==p2);//-->对于引用数据类型来说,比较的是地址值.---->返回的一定是false

        //Object类提供了一个方法equals方法:作用:比较对象具体内容是否相等.
        boolean flag = p1.equals(p2);//点进源码发现:底层依旧比较的是==,比较的还是地址值.
        System.out.println(flag);
        cat c=new cat();
        System.out.println(p1.equals(c));
     /*   double a =10086;
        double b =10086;
        System.out.println(a==b);
        System.out.println("分界线-------");
        System.out.println(Double.doubleToLongBits(a) != Double.doubleToLongBits(b));*/
    }
}
