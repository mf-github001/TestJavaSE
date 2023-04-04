package com.mf.test07;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 11:39
 */
public class TestSend {//发送方：
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
            DatagramSocket ds = null;
            OutThread oSd =null;
             inThread it =null;
        try {
            System.out.println("学生上线。。。");
            //1.准备套接字： 指定发送方的端口号
            ds = new DatagramSocket(8888);
             oSd = new OutThread(ds,9999,"学生");//创建线程对象
            oSd.start();
            //接收老师发送回来的信息：
             it = new inThread(ds, "老师");
            it.start();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

