package com.mf.io4;

import java.io.PrintStream;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 19:04
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //写到控制台：
        PrintStream out = System.out;
        //调用方法：
        out.print("你好1");//直接在控制台写出，但是不换行
        out.print("你好2");
        out.print("你好3");
        out.print("你好4");
        out.println("我是中国人1");//直接在控制台写出，并且换行操作
        out.println("我是中国人2");
        out.println("我是中国人3");
        out.println("我是中国人4");
        System.out.println("你是");
        System.out.print("中国人");
    }
}
