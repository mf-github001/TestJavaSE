package com.mf.test06;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 11:39
 */
public class TestSend {//发送方：
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线。。。");
        //1.准备套接字： 指定发送方的端口号
        DatagramSocket ds = new DatagramSocket(8888);
        //2.准备数据包
        Scanner sc = new Scanner(System.in);
        System.out.print("学生：");
        String str = sc.next();
        byte[] bytes = str.getBytes();
        /*
        DatagramPacket
        需要四个参数：
        1.指的是传送数据转为Z字节数组
        2.字节数组的长度
        3.封装接收方的ip
        4.指定接收方的端口号
         */
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,
                                    InetAddress.getByName("localhost"),9999);
        //发送：
        ds.send(dp);
        //接收老师发送回来的信息：
        byte[] b = new byte[1024];
        DatagramPacket dp2 = new DatagramPacket(b,b.length);
        ds.receive(dp2);//接收完以后 dp2里面就填充好内容了
        //取出数据：
        byte[] data = dp2.getData();
        String s = new String(data,0,dp2.getLength());//dp.getLength()数组包中的有效长度
        System.out.println("老师对我说："+s);
        //关闭资源
        ds.close();
    }
}
