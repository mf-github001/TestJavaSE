package com.mf.io02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @Auther: mf
 * @Date: 2022/11/28 - 11 - 28 - 18:57
 */
public class Test04 {
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

        long startTime = System.currentTimeMillis();
        //5.开始复制：（边读边写）
        int n = fis.read();
        while(n!=-1){
            fos.write(n);
            n = fis.read();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("复制完成的时间为："+(endTime-startTime));
        //6.关闭流：(倒着关闭流，先用后关)
        fos.close();
        fis.close();
    }
}
