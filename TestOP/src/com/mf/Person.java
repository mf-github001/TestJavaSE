package com.mf;

/**
 * @Auther: mf
 * @Date: 2021/7/20 - 07 - 20 - 17=53
 * 创建类：人类
 */
public class Person {
    //名词--->属性(注意:我们只把有需要的内容写到代码里,不相关的东西不要放在代码中)
    int age;//年龄
    String name;//姓名
    double height;//身高
    double weight;//体重

    //动词---->方法
    //吃饭
    public void eat() {
        int num = 10;//局部变量:放在方法中
        System.out.println("我喜欢吃饭");
    }

    //睡觉:
    public void sleep(String adderss) {
        System.out.println("我在" + adderss + "睡觉");
    }

    //自我介绍
    public String introduce() {
        return   "我的名字是:" + name + ",我的年龄是" + age + ",我的身高是:" + height + ",我的体重是:" + weight;
    }
}

