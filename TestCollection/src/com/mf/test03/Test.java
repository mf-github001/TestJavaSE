package com.mf.test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 17:36
 */
public class Test {
    public void a(List<?> list){
        //1.遍历：
        for(Object a:list){
            System.out.println(a);
        }
        //2.数据的写入操作 ：
        //list.add("abc");-->出错，不能随意的添加数据
        list.add(null);
        //3.数据的读取操作：
        Object s = list.get(0);
    }
}
class T{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        Test t = new Test();
        t.a(new ArrayList<Integer>());
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Object>());
    }
}