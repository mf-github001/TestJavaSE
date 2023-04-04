package com.mf.test07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: mf
 * @Date: 2022/11/30 - 11 - 30 - 19:56
 */
public class Test02 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //2.定义一个时间格式：
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        while(true){
            //1.获取当前时间：
            Date d = new Date();
            //3.按照上面定义的格式将Date类型转为指定格式的字符串：
            System.out.println(df.format(d));
            try {
                Thread.sleep(1000);//睡眠1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
