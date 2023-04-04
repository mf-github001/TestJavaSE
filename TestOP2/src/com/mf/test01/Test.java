package com.mf.test01;

import java.util.Scanner;

/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 17:51
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //创建一个Girl类的对象:
      //Girl g=new Girl();
        /*g.age=18;
        System.out.println(g.age);*/
        int arr[]=new int[10];
        //设置循环:
        int num=16;
        for (int i = 1; i <11 ; i++) {
            //设置年龄:
            Scanner sc =new Scanner(System.in);
           // System.out.print("第"+i+"次.请录入一个年龄：");
            //int num = sc.nextInt();
            arr[i-1]=num;
            //g.shezhiAge(num);
            num++;
            //读取年龄:
          //  System.out.println("第"+i+"次.读取到的年龄是"+g.duquAge()+"岁");
        }
        System.out.println("第3次录入的年龄是:"+arr[2]);
        //打擂,找最大
        //先随机挑一个
        int Maxage=arr[0];
        for (int i = 0; i <10; i++) {
            if (Maxage<arr[i]) {
                Maxage=arr[i];
            }
        }
        System.out.println("其中年龄最大的是:"+Maxage);
        //数组的遍历:
         int c=0;
        for (int num1 : arr) {
            System.out.print('\t');
            System.out.println("arr["+c+"]=:"+num1);
            c++;
        }
        System.out.println();
        int t =(int)'\t';
        System.out.println("\\t的值为"+t);
        System.out.println("圆周率"+Math.PI);

    }
}
