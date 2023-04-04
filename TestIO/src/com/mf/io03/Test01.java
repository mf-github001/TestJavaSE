package com.mf.io03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 18:17
 */
public class Test01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //文件---》程序：
        //1.有一个源文件：
        File f = new File("E:\\StudyFile\\java\\IO\\wenben.txt");
        //2.需要一个输入的字节流接触文件：
        FileInputStream fis = new FileInputStream(f);
        //3.加入一个转换流，将字节流转换为字符流：（转换流属于一个处理流）
        //将字节转换为字符的时候，需要指定一个编码，这个编码跟文件本身的编码格式统一
        //如果编码格式不统一的话，那么在控制台上展示的效果就会出现乱码
        //InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //获取程序本身的编码--》utf-8
        InputStreamReader isr = new InputStreamReader(fis);
        //4.开始动作，将文件中内容显示在控制台：
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len!=-1){
            //将缓冲数组转为字符串在控制台上打印出来
            System.out.print(new String(ch,0,len));
            len = isr.read(ch);
        }
        //5.关闭流：
        isr.close();
    }
}
