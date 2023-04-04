package com.mf.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 17:38
 */
public class Demo {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;
    }
}

