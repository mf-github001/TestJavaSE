package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2021/8/4 - 08 - 04 - 23:15
 */
public class Girl {
    //属性:
    String name;
    double height;
    int age;
    Mom m/*=new Mom()*/;

    //方法:
    public void add(int a){//参数是基本数据类型
        System.out.println(a);
        System.out.println(a+100);
    }
    //方法一;
    public void asslove(Boy b){//参数是引用数据类型boy
        System.out.println("暗杀名单-目标名称:"+b.name+'\n'+"目标年龄"+b.age);
        System.out.print("暗杀原因:");
        b.buy();
    }
    //方法二:妈妈的爱
    public void wechat(){
       m.say();
    }

    //构造器:
    public Girl() {
    }

    public Girl(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
}
