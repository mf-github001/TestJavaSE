package com.mf.test01;
/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 19:44
 */
public class Test02 {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建一个Girl类的对象:
        Girl g = new Girl();
        /*g.age=18;
        System.out.println(g.age);*/

        //设置年龄:
        g.setAge(16);

        //读取年龄:
        System.out.println("读取到的年龄是" + g.getAge() + "岁");
    }
}
