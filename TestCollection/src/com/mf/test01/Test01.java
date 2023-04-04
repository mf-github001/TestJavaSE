package com.mf.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 14:15
 */
public class Test01 {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        /*
        Collection接口的常用方法：
        增加：add(E e) addAll(Collection<? extends E> c)
        删除：clear() remove(Object o)
        修改：
        查看：iterator() size()
        判断：contains(Object o)  equals(Object o) isEmpty()
         */
        //创建对象:接口不能创建对象,利用实现类创建对象:
        //Collection为父接口,List为子接口,ArrayList为子接口实现类
        Collection col=new ArrayList();
        //调用方法:
        //集合有一个特点:只能存放引用数据类型的数据,不能是基本数据类型
        //基本数据类型自动装箱,对应包装类. int ---->intger

        //往集合里添加元素:
        col.add(18);
        col.add(19);
        col.add(20);
        col.add(33);
        col.add(14);
        System.out.println(col);//输出集合中的元素，输出结果：[18, 19, 20, 33, 14]
        //创建一个新集合
        List list= Arrays.asList(new Integer[]{11,15,3,7,1});
        col.addAll(list);//将另一个集合添加入col中
        System.out.println(col);//输出集合中的元素 输出结果：[18, 19, 20, 33, 14, 11, 15, 3, 7, 1]
//        col.clear();//清空集合
        System.out.println(col);
        System.out.println("集合中元素的数量为:"+col.size());
        System.out.println("集合是否为空:"+col.isEmpty());
        boolean isRemove = col.remove(15);//删除某元素
        System.out.println("集合中的元素是否被删除:"+isRemove);

        Collection col2 = new ArrayList();
        col2.add(18);
        col2.add(12);
        col2.add(11);
        col2.add(17);
        Collection col3 = new ArrayList();
        col3.add(18);
        col3.add(12);
        col3.add(11);
        col3.add(17);
        System.out.println(col2.equals(col3));//比较两个元素的值
        System.out.println(col2==col3);//地址一定不相等  false
        System.out.println("是否包含元素："+col3.contains(117));


    }
}
