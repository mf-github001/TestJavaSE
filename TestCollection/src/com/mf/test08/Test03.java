package com.mf.test08;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther: mf
 * @Date: 2022/11/13 - 11 - 13 - 19:10
 */
public class Test03 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //Collections不支持创建对象，因为构造器私有化了
        /*Collections cols = new Collections();*/
        //里面的属性和方法都是被static修饰，我们可以直接用类名.去调用即可：
        //常用方法：
        //addAll：
        ArrayList<String> list = new ArrayList<>();
        list.add("cc");
        list.add("bb");
        list.add("aa");
        Collections.addAll(list,"ee","dd","ff");
        Collections.addAll(list,new String[]{"gg","oo","pp"});
        System.out.println(list);//[cc, bb, aa, ee, dd, ff, gg, oo, pp]
        //binarySearch必须在有序的集合中查找：--》排序：
        Collections.sort(list);//sort提供的是升序排列
        System.out.println(list);//[aa, bb, cc, dd, ee, ff, gg, oo, pp]
        //binarySearch
        System.out.println(Collections.binarySearch(list, "cc"));//2
        //copy:替换方法
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"tt","ss");
        Collections.copy(list,list2);//将list2的内容替换到list上去
        System.out.println(list);//[tt, ss, cc, dd, ee, ff, gg, oo, pp]
        System.out.println(list2);//[tt, ss]
        //fill 填充
        Collections.fill(list2,"yyy");
        System.out.println(list2);//[yyy, yyy]

    }
}
