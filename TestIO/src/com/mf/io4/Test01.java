package com.mf.io4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 18:49
 */
public class Test01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        //得到的是标准的输入流：--》从键盘输入：
        //InputStream in = System.in;
        //调用方法：
        //int n = in.read();//read方法等待键盘的录入，所以这个方法是一个阻塞方法。
        //System.out.println(n);
        //以前案例：从键盘录入一个int类型的数据：
        //从上面的代码证明，键盘录入实际上是：System.in
        //形象的理解：System.in管，这个管怼到键盘上去了，所以你从键盘录入的话，就从这个管到程序中了
        //Scanner的作用：扫描器：起扫描作用的，扫键盘的从这根管出来的数据
        /*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);*/
        //既然Scanner是扫描的作用，不一定非得扫 System.in进来的东西，还可以扫描其他管的内容：
        Scanner sc = new Scanner(new FileInputStream(new File("E:\\StudyFile\\java\\IO\\wenben.txt")));
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
    }
}
/**/