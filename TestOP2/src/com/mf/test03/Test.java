package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 23:12
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建子类Student的对象:
        Student s=new Student();
        s.setSno(2001);
        s.setAge(18);
        s.setHeight(210);
        s.setName("李华");
        s.equals(s);
        System.out.println("学生名字为:"+s.getName()+"学号为"+s.getSno()+"年龄为:"+s.getAge()+"身高为"+s.getHeight());
        s.eat();
        s.study();
        s.sleep();
   }
}
