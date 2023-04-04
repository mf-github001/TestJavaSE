//声明包：
package com.mf7;

import com.mf2.Person;

import java.util.ArrayList;
import java.util.HashMap;

/*import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;*/
import java.util.*;//* 代表所有

/**
 * @Auther: mf
 * @Date: 2021/7/23 - 07 - 23 - 21:56
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        new Person();//使用其他包下的类,需要进行导包
        new Date();
        new java.sql.Date(1000L);//在导包以后,还想用其他包下同名的类,就必须要手动自己写所在的包
        new Demo();
        System.out.println(Math.random());
        new ArrayList<>();
        new HashMap<>();
    }
}
