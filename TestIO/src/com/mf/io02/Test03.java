package com.mf.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: mf
 * @Date: 2022/11/28 - 11 - 28 - 18:47
 */
public class Test03 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //功能：利用字节流将文件中内容读到程序中来：
        //1.有一个源文件：
        File f = new File("E:\\StudyFile\\java\\IO\\photo.png");
        //2.将一个字节流这个管 怼  到 源文件上：
        FileInputStream fis = new FileInputStream(f);
        //3.开始读取动作
        //利用缓冲数组：（快递员的小车）
        byte[] b = new byte[1024*3072];
        int len = fis.read(b);//len指的就是读取的数组中的有效长度
        System.out.println(len);
        while(len!=-1){
            for(int i = 0;i<len;i++){
                System.out.println(b[i]);
            }
            len = fis.read(b);
        }
        //4.关闭流：
        fis.close();
    }
}
