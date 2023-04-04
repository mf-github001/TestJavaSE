package com.mf.test07;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 11:39
 * 实现双向通信，实时接收实时发送
 */
public class TestReceive {//接收方
    //这是一个main方法，是程序的入口：
    public static void main(String[] args)  {
        System.out.println("老师上线了。。");
        //1.创建套接字：指定接收方的端口
        DatagramSocket ds= null;
        inThread it=null;
        OutThread ots=null;
        try {
            ds = new DatagramSocket(9999);
            //接收学生消息
            it = new inThread(ds, "学生");
            it.start();
            //老师进行回复：
            ots = new OutThread(ds, 8888, "老师");
            ots.start();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}



