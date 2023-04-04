package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2022/12/20 - 12 - 20 - 8:03
 */
public class Demo {
    public static void main(String[] args) {
        /*
        Class类的具体的实例：
        （1）类：外部类，内部类
        （2）接口
        （3）注解
        （4）数组
        （5）基本数据类型
        （6）void
         */
        Class c1 = Person.class;//类
        Class c2 = Comparable.class;//接口
        Class c3 = Override.class;//注解
        int[] arr1 = {1,2,3};
        Class c4 = arr1.getClass();//数组
        int[] arr2 = {5,6,7};
        Class c5 = arr2.getClass();
        System.out.println(c4==c5);//结果：true .同一个维度，同一个元素类型,得到的字节码就是同一个

        Class c6 = int.class;//基本数据类型
        Class c7 = void.class;//void
    }
}
