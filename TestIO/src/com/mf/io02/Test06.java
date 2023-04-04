package com.mf.io02;

import java.io.*;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 17:30
 */
public class Test06 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //1.有一个源图片
        File f1 = new File("E:\\StudyFile\\java\\IO\\photo.png");
        //2.有一个目标图片：
        File f2 = new File("E:\\StudyFile\\java\\IO\\photo2.png");
        //3.有一个输入的管道 怼 到 源文件：
        FileInputStream fis = new FileInputStream(f1);
        //4.有一个输出的管道 怼到  目标文件上：
        FileOutputStream fos = new FileOutputStream(f2);
        //5.功能加强，在FileInputStream外面套一个管：BufferedInputStream:
        BufferedInputStream bis = new BufferedInputStream(fis);//将FileInputStream对象传入
        //6.功能加强，在FileOutputStream外面套一个管：BufferedOutputStream:
        BufferedOutputStream bos = new BufferedOutputStream(fos);//将FileOutputStream对象传入
        //7.开始动作 ：
        //开始时间
        long startTime = System.currentTimeMillis();

        byte[] b = new byte[1024*6];
        int len = bis.read(b);
        while(len!=-1){
            bos.write(b,0,len);
            /* bos.flush(); 底层已经帮我们做了刷新缓冲区的操作，不用我们手动完成：底层调用flushBuffer()*/
            len = bis.read(b);
        }
        //结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("复制完成的时间为："+(endTime-startTime));


        //8.关闭流：
        //倒着关：
        //如果处理流包裹着节点流的话，那么其实只要关闭高级流（处理流），那么里面的字节流也会随之被关闭。
        bos.close();
        bis.close();
        /*fos.close();
        fis.close();*/
    }
}
