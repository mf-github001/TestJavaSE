package com.mf.io;

import java.io.*;

/**
 * @Auther: mf
 * @Date: 2022/11/28 - 11 - 28 - 17:23
 */
public class Test04 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args)  {
        //1.有一个源文件
        File f1 = new File("E:\\StudyFile\\java\\IO\\Test.txt");
        //2.有一个目标文件：
        File f2 = new File("E:\\StudyFile\\java\\IO\\demo.txt");
        //3.搞一个输入的管 怼到源文件上：
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f1);
            //4.搞一个输出的管，怼到目标文件上：
            fw = new FileWriter(f2);
            //5.开始动作：
            char[] ch = new char[5];
            int len = fr.read(ch);
            while(len!=-1){
                String s = new String(ch,0,len);
                fw.write(s);
                len = fr.read(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭流：(关闭流的时候，倒着关闭，后用先关)
            try {
                if(fw!=null){//防止空指针异常
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
