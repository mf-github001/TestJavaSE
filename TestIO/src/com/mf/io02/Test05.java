package com.mf.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: mf
 * @Date: 2022/11/28 - 11 - 28 - 19:04
 */
public class Test05 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //功能：完成图片的复制：
        //1.有一个源图片
        File f1 = new File("E:\\StudyFile\\java\\IO\\photo.png");
        //2.有一个目标图片：
        File f2 = new File("E:\\StudyFile\\java\\IO\\photo2.png");
        //3.有一个输入的管道 怼 到 源文件：
        FileInputStream fis = new FileInputStream(f1);
        //4.有一个输出的管道 怼到  目标文件上：
        FileOutputStream fos = new FileOutputStream(f2);
        //5.开始复制：（边读边写）
        long startTime = System.currentTimeMillis();
        //利用缓冲数组：(更快速)
        byte[] b = new byte[1024*8];
        int len = fis.read(b);
        int i=0;
        while(len!=-1){
            fos.write(b,0,len);//只写入有效长度,不然复制后的文件会比原始文件大
            len = fis.read(b);
            System.out.println(i++);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("复制完成的时间为："+(endTime-startTime));

        //6.关闭流：(倒着关闭流，先用后关)
        fos.close();
        fis.close();
    }
}
