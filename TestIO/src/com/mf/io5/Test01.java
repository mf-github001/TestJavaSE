package com.mf.io5;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 19:37
 */
public class Test01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //DataOutputStream:  将内存中的基本数据类型和字符串的变量 写出  文件中
/*        File f = new File("d:\\Demo2.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);*/
        DataOutputStream dos = new DataOutputStream(
                               new FileOutputStream(
                               new File("E:\\StudyFile\\java\\IO\\writ.txt")));
        //向外将变量写到文件中去：
        dos.writeUTF("你好");//写入字符串
        dos.writeBoolean(false);
        dos.writeDouble(6.9);
        dos.writeInt(82);
        //关闭流：
        dos.close();
    }
}
