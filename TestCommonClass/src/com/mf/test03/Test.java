package com.mf.test03;


import java.util.Random;

/**
 * @Auther: mf
 * @Date: 2022/12/23 - 12 - 23 - 9:26
 */
public class Test {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
        System.out.println("随机数："+Math.random());
        //学习Random类
        //（1）利用带参数的构造器创建对象：
        Random r1 = new Random(System.currentTimeMillis()/*传入时间戳*/);//需要传入一个值做seed
        int i = r1.nextInt();
        System.out.println(i);
        //（2）利用空参构造器创建对象：
        Random r2 = new Random();//表面是在调用无参数构造器，实际底层还是调用了带参构造器
        System.out.println(r2.nextInt(10));//在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        System.out.println(r2.nextDouble());//在 0.0 和 1.0 之间均匀分布的 double 值。
    }
}
