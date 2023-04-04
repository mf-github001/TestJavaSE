package com.mf.test05;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 18:16
 */
public class Test {

    //这是main方法，程序的入口
    public static void main(String[] args) {
        /*
        LinkedList常用方法：
        增加 addFirst(E e) addLast(E e)
             offer(E e) offerFirst(E e) offerLast(E e)
        删除 poll()
            pollFirst() pollLast()  ---》JDK1.6以后新出的方法，提高了代码的健壮性
            removeFirst() removeLast()
        修改
        查看 element()
             getFirst()  getLast()
             indexOf(Object o)   lastIndexOf(Object o)
             peek()
             peekFirst() peekLast()
        判断
         */
        //创建一个LinkedList集合对象：
        LinkedList<String> list = new LinkedList<>();
        list.add("aaaaa");
        list.add("bbbbb");
        list.add("ccccc");
        list.add("ddddd");
        list.add("eeeee");
        list.add("bbbbb");
        list.add("fffff");
        list.addFirst("jj");//在头部添加元素
        list.addLast("hh");//在尾部添加元素
        list.offer("kk");//添加元素在尾端
        list.offerFirst("pp");
        list.offerLast("rr");
        System.out.println(list);//LinkedList可以添加重复数据
        System.out.println(list.poll());//删除头上的元素并且将元素输出
        System.out.println(list.pollFirst());//删除头部元素
        System.out.println(list.pollLast());//删除尾部元素

        System.out.println(list.removeFirst());//删除头部元素
        System.out.println(list.removeLast());//删除尾部元素
        System.out.println(list);//LinkedList可以添加重复数据

        /*list.clear();//清空集合
        System.out.println(list);*/
        /*System.out.println(list.pollFirst());*/
        /*System.out.println(list.removeFirst());报错：Exception in thread "main" java.util.NoSuchElementException*/

        //集合的遍历：
        System.out.println("---------------------");
        //普通for循环：
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        //增强for：
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("---------------------");
        //迭代器：
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());//正常输出
        }*/
        //下面这种方式好，节省内存
        for(Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}


