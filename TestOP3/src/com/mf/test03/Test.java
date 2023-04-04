package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2021/8/4 - 08 - 04 - 23:24
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
         //创建一个boy类的集体的对象:
        Boy boy=new Boy(19,"钢铁直男");
        Boy boy2=new Boy(20,"电竞boy");
        //创建一个Girl类的具体的对象;
        Girl girl=new Girl("无情刺客" ,170.4,18);
        //恋爱--杀戮时刻:
        girl.asslove(boy2);
        System.out.println("--------分界线----------"+'\n'+"人间自有真情在");
        //来自妈妈的爱:
        girl.m=new Mom();//在这里女孩的妈妈也是一个属性,需要先给她一个妈
        girl.wechat();
    }
}
