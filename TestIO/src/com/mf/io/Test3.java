package com.mf.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: mf
 * @Date: 2022/11/28 - 11 - 28 - 16:53
 */
public class Test3 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //1.有个目标文件：
        File f = new File("E:\\StudyFile\\java\\IO\\demo.txt");
        //2.FileWriter管怼到文件上去：
        FileWriter fw = new FileWriter(f,/*false*/true);
        //false对原文件进行覆盖操作,true对原文件进行追加操作

        //3.开始动作：输出动作：
        //一个字符一个字符的往外输出：
        String str = "你好中国";
        char[] chars = str.toCharArray();
        fw.write(chars);
        //4.关闭流：
        fw.close();
    }
}
