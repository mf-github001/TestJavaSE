package com.mf.enum01;

/**
 * @Auther: mf
 * @Date: 2022/12/8 - 12 - 08 - 18:26
 */
public class TestSeason {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn.getSeasonName()+'\t'+autumn.getSeasonDesc());
    }
}
