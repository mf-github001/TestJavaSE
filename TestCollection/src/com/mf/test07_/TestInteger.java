package com.mf.test07_;

import java.util.LinkedHashSet;

/**
 * @Auther: mf
 * @Date: 2022/11/13 - 11 - 13 - 14:48
 */
public class TestInteger {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建一个HashSet集合：
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        System.out.println(hs.add(19));//true
        hs.add(5);
        hs.add(20);
        System.out.println(hs.add(19));//false 这个19没有放入到集合中
        hs.add(41);
        hs.add(0);
        System.out.println(hs.size());//唯一，无序
        System.out.println(hs);

    }
}
