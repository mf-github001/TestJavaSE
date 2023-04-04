package com.mf.test07;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 19:54
 */
public class Test01 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        try {
            Thread.sleep(3000);//3000毫秒--》3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("00000000000000");
    }
}
