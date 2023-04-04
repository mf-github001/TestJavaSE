package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2021/8/5 - 08 - 05 - 13:43
 */
public class Dog extends Animal {
    String name;
    int longs;
    //喊叫:
    public void shout(){
        System.out.println("小狗,汪汪的叫");
    }
    public void guard(){
        System.out.println("小狗可以看家护院");
    }
}
