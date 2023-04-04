package com.mf.io4;

import java.io.*;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 19:07
 */
public class Test03 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //1.先准备输入方向：
        //键盘录入：
        InputStream in = System.in;//属于字节流
        //转换:字节流--》字符流：
        InputStreamReader isr = new InputStreamReader(in);
        //在isr外面再套一个缓冲流：
        BufferedReader br = new BufferedReader(isr);
        //2.再准备输出方向：
        //准备目标文件
        File f = new File("E:\\StudyFile\\java\\IO\\sys.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);//叠buffer
        //3.开始动作：
        String s = br.readLine();
        while(!s.equals("exit")){//输入exit则退出循环
            bw.write(s);
            bw.newLine();//文件中换行
            s = br.readLine();
        }
        //4.关闭流：
        bw.close();
        br.close();
    }
}
