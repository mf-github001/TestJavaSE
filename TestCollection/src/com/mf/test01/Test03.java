package com.mf.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 14:17
 */
public class Test03 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        /*
        List接口中常用方法：
        增加：add(int index, E element)
        删除：remove(int index)  remove(Object o)
        修改：set(int index, E element)
        查看：get(int index)
        判断：
         */
        //利用实现类创建接口对象
        List list = new ArrayList();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);
        list.add(3,66);//在下标为3的位置,添加元素
        System.out.println(list);
        list.set(3,77);//修改元素,下标为3的元素修改为77
        System.out.println(list);
        list.remove(2);
        //在集合中存入的是Integer类型数据的时候，
        // 调用remove方法调用的是：remove(int index)
        System.out.println(list);
        list.remove("abc");
        System.out.println(list);

        Object o = list.get(0);//获得指定下标的元素
        //集合中的元素,用Object类型接收
        System.out.println(o);

        //List集合 遍历：
        //方式1：普通for循环：
        System.out.println("---------------------");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //方式2：增强for循环：
        System.out.println("---------------------");
        for(Object obj:list){
            System.out.println(obj);
        }
        //方式3：迭代器：
        System.out.println("---------------------");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //创建一个ArrayList集合，向这个集合中存入学生的成绩：
        //加入泛型的优点：在编译时期就会对类型进行检查，不是泛型对应的类型就不可以添加入这个集合。
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(98);
        al.add(18);
        al.add(39);
        al.add(60);
        al.add(83);
        /*al.add("丽丽");
        al.add(9.8);*/
        //对集合遍历查看：
        /*for(Object obj:al){
            System.out.println(obj);
        }*/
        for(Integer i:al){
            System.out.println(i);
        }
    }

    }

