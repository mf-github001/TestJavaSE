package com.mf.io6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 20:55
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\StudyFile\\java\\IO\\writ2.txt")));
        //读入内存：
        Person p = (Person)(ois.readObject());
        System.out.println(p/*.toString()*/);
        //关闭流：
        ois.close();
    }
}
