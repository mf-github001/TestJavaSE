package com.mf.io03;

import java.io.*;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 18:37
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //1.有一个源文件
        File f1 = new File("E:\\StudyFile\\java\\IO\\wenben.txt");
        //2.有一个目标文件：
        File f2 = new File("E:\\StudyFile\\java\\IO\\outtxt.txt");
        //3.输入方向：
        FileInputStream fis = new FileInputStream(f1);
        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        //4.输出方向：
        FileOutputStream fos = new FileOutputStream(f2);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-16");//指定输出文件的文件格式
        //5.开始动作：
        char[] ch = new char[20];
        int len = isr.read(ch);
        while(len!=-1){
            osw.write(ch,0,len);
            len = isr.read(ch);
        }
        //6.关闭流：
        osw.close();
        isr.close();
    }
}
