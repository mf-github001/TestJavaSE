package com.mf.test07;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 20:58
 */
public class Test {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        //在"cc"之后添加一个字符串"kk"
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            if ("cc".equals(it.next())) {
                it.add("kk");
            }
        }
        System.out.println(list);//[aa, bb, cc, kk, dd, ee]
        System.out.println(it.hasNext());//判断是否有下一个元素f false 刚正向遍历完,指针在最后
        System.out.println(it.hasPrevious());//判断是否有上一个元素
        //逆向遍历：
        while(it.hasPrevious()){
            System.out.println(it.previous());//指针向上移
        }
        System.out.println(it.hasNext());//true
        System.out.println(it.hasPrevious());//false
        System.out.println(list);

    }
}
