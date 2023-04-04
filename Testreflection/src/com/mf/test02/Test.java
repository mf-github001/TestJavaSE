package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2022/12/20 - 12 - 20 - 7:48
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //案例：以Person的字节码信息为案例
        //方式1：通过getClass()方法获取
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);//class com.mf.test01.Person
        //方式2：通过内置class属性：
        Class c2 = Person.class;
        System.out.println(c2);//class com.mf.test01.Person
        System.out.println(c1==c2);//true
        //注意：方式1和方式2  不常用
        //方式3：--》用的最多：调用Class类提供的静态方法forName
        Class c3 = Class.forName("com.mf.test02.Person");
        //方式4：利用类的加载器(了解技能点)
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("com.mf.test02.Person");
    }
}
