package com.mf.test07_;

import java.util.HashSet;

/**
 * @Auther: mf
 * @Date: 2022/11/13 - 11 - 13 - 14:53
 */
public class TestString {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("apple");
        hs.add("html");
        hs.add("hello");
        hs.add("hello");
        System.out.println(hs.size());//size()返回集合数
        System.out.println(hs);
}
}
