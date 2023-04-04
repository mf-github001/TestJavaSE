package com.mf.anno2;

import java.util.ArrayList;

/**
 * @Auther: mf
 * @Date: 2022/12/8 - 12 - 08 - 1:55
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        @SuppressWarnings("unused")//抑制不使用警告
        int age = 10;

        int age2 =12;

        int num = 10;
        System.out.println(num);
        @SuppressWarnings({"unused","rwatypes"})//rwatypes 抑制未指定泛型警告
        ArrayList al = new ArrayList();
    }
}
