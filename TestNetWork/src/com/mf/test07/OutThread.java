package com.mf.test07;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 13:36
 */
public class OutThread extends Thread {
    DatagramSocket ds = null;
    private  int port;
    private String usname;
    public OutThread(DatagramSocket ds, int port, String usname) {
        this.ds = ds;
        this.port=port;
        this.usname=usname;
    }
    @Override
    public void run() {
        while (true) {
            //2.准备数据包
            Scanner sc = new Scanner(System.in);
            System.out.print(usname+"：");
            String str = sc.next();
            byte[] bytes = str.getBytes();
                /*
                需要四个参数：
                1.指的是传送数据转为Z字节数组
                2.字节数组的长度
                3.封装接收方的ip
                4.指定接收方的端口号
                 */
            DatagramPacket dp = null;
            try {
                dp = new DatagramPacket(bytes, bytes.length,
                        InetAddress.getByName("localhost"),port );
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            //发送：
            try {
                ds.send(dp);//发送数据
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (str.equals("byebye")) {
                System.out.println(usname+"下线。。");
                ds.close();
                System.exit(0);
            }
        }
    }
}