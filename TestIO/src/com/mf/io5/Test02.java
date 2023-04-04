package com.mf.io5;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 19:49
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //DataInputStream:将文件中存储的基本数据类型和字符串  写入  内存的变量中
        DataInputStream dis = new DataInputStream(
                                new FileInputStream(
                                new File("E:\\StudyFile\\java\\IO\\writ.txt")));
        //将文件中内容读取到程序中来：
        System.out.println(dis.readUTF());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readInt());
        //关闭流：
        dis.close();
    }
}
