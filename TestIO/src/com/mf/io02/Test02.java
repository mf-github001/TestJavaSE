package com.mf.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: mf
 * @Date: 2022/11/28 - 11 - 28 - 18:26
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //功能：利用字节流将文件中内容读到程序中来：
        //1.有一个源文件：
        File f = new File("E:\\StudyFile\\java\\IO\\photo.png");
        //2.将一个字节流这个管 怼  到 源文件上：
        FileInputStream fis = new FileInputStream(f);
        //3.开始读取动作
        int count = 0;//定义一个计数器，用来计读入的字节的个数
        int n = fis.read();//一个字节一个字节读取
        while(n!=-1){
            count++;
            System.out.println(n);
            n = fis.read();
        }
        System.out.println("count="+count);
        //4.关闭流：
        fis.close();
    }
}
