package com.mf.test08;

import java.util.HashMap;

/**
 * @Auther: mf
 * @Date: 2022/11/13 - 11 - 13 - 17:40
 */
public class Test02 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //JDK1.7以后支持后面的<>中内容可以不写
        HashMap<Integer,String> hm = new HashMap<>();//创建一个HashMap的对象:存储的是双列数据,键值对key-value
        System.out.println(hm.put(12,"丽丽"));
        System.out.println(hm.put(7,"菲菲"));
        System.out.println(hm.put(19,"露露"));
        System.out.println(hm.put(12,"明明"));
        System.out.println(hm.put(6,"莹莹"));
        System.out.println("集合的长度："+hm.size());
        System.out.println("集合中内容查看："+hm);
    }
}
