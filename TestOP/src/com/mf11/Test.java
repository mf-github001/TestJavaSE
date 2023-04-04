package com.mf11;
//静态导入:
import static java.lang.Math.*;
//导入:java.lang下的Math类中的所有的静态的内容
/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 16:04
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        System.out.println(random());//随机数
        System.out.println(PI);//圆周率
        System.out.println(round(5.8));//四舍五入
    }
    //在静态导入后,同一个类中有相同的方法的时候,会优先走自己定义的方法.
    public static int round(double a){
        return 10000;
    }
}
