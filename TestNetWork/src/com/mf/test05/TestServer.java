package com.mf.test05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 9:57
 */
public class TestServer {//服务器
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        System.out.println("服务器启动了");
        //1.创建套接字： 指定服务器的端口号
        ServerSocket ss = null;
        Socket s = null;
        int count = 0;//定义一个计数器，用来计数  客户端的请求
        try {
            ss = new ServerSocket(8888);
            while(true){//加入死循环，服务器一直监听客户端是否发送数据
                s = ss.accept();//阻塞方法:等待接收客户端的数据，什么时候接收到数据，什么时候程序继续向下执行。
                //每次过来的客户端的请求 靠 线程处理：
                new ServerThread(s).start();
                count++;
                //输入请求的客户端的信息：
                System.out.println("当前是第"+count+"个用户访问我们的服务器,对应的用户是："+s.getInetAddress());
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
