package com.mf.test09;

import java.util.Arrays;

/**
 * @Auther: mf
 * @Date: 2021/7/25 - 07 - 25 - 20:11
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        int arr[]=new int[20];
        int num =32;
        int num1=36;
        for (int i = 0; i <=19 ; i++) {
            arr[i]=num+num1;
            if(num>32){
                num--;
            }else{
                num++;
            }
            if(num1<=30){
                num1++;
            }else{
                num1--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
