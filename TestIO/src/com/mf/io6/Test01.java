package com.mf.io6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 20:51
 */
public class Test01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //序列化：将内存中对象 ---》 文件：
        //有一个对象：
        Person p = new Person();
        //有对象流：
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:\\StudyFile\\java\\IO\\writ2.txt")));
        //向外写：
        oos.writeObject(p);
        //关闭流：
        oos.close();
    }
}
