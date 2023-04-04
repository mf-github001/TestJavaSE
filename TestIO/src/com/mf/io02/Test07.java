package com.mf.io02;

import java.io.*;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 17:58
 */
public class Test07 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //1.有一个源图片
        File f1 = new File("E:\\StudyFile\\java\\IO\\Test.txt");
        //2.有一个目标图片：
        File f2 = new File("E:\\StudyFile\\java\\IO\\demo2.txt");
        //3.需要一个管 怼到 源文件：
        FileReader fr = new FileReader(f1);
        //4.需要一根管怼到目标文件：
        FileWriter fw = new FileWriter(f2);
        //5.套一根管在输入字符流外面：
        BufferedReader br = new BufferedReader(fr);
        //6.套一根管在输出字符流外面：
        BufferedWriter bw = new BufferedWriter(fw);
        //7.开始动作：
        //方式1：读取一个字符，输出一个字符：
        /*int n = br.read();//读取
        while(n!=-1){
            bw.write(n);//写入
            n = br.read();
        }*/
        //方式2:利用缓冲数组：
        /*char[] ch = new char[30];
        int len = br.read(ch);//读取
        while(len!=-1){
            bw.write(ch,0,len);//写入
            len = br.read(ch);//再读取
        }*/
        //方式3：读取String：
        String str = br.readLine();//每次读取文本文件中一行，返回字符串
        while(str!=null){
            bw.write(str);//将读取到的字符串写入到文件
            //若写入的文件不存在,会新建一个文件
            //在文本文件中应该再写出一个换行：
            bw.newLine();//新起一行
            str = br.readLine();
        }
        //8.关闭流
        bw.close();
        br.close();
    }
}
