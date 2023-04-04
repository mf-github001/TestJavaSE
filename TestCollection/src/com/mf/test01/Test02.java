package com.mf.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 14:50
 */
public class Test02 {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(18);
        col.add(12);
        col.add(11);
        col.add(17);
        col.add("abc");
        col.add(9.8);
        //对集合遍历（对集合中元素进行查看）
        //方式1：普通for循环
        /*for(int i= 0;i<col.size();i++){
            col.//没有对应的索引无法遍历,
        }*/
        //方式2：增强for循环
        for(Object o:col){
            System.out.println(o);
        }
        System.out.println("------------------------");
        //方式3：iterator()//利用迭代器
        Iterator it = col.iterator();
        while(it.hasNext()){//判断是否还有下一个元素
            System.out.println(it.next());//返回当前元素的值,并将指针移动到下一个元素
        }
    }
}
