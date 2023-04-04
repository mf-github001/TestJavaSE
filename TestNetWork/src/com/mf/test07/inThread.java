package com.mf.test07;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 14:08
 */
public class inThread extends Thread {
    DatagramSocket ds;
    private String usname;
    public inThread(DatagramSocket ds, String usname) {
        this.ds = ds;
        this.usname = usname;
    }
    @Override
    public void run() {
        while(true) {
            //接收发送回来的信息：
            byte[] b = new byte[1024];
            DatagramPacket dp2 = new DatagramPacket(b, b.length);
            try {
                ds.receive(dp2);//接收完以后 dp2里面就填充好内容了
            } catch (IOException e) {
                e.printStackTrace();
            }
            //取出数据：
            byte[] data = dp2.getData();
            String s = new String(data, 0, dp2.getLength());//dp.getLength()数组包中的有效长度
            if (s.equals("byebye")) {
                System.out.println("\n对方已经下线了，聊天结束。。。");
                ds.close();
                System.exit(0);
            }
            System.out.print('\n'+usname + "对我说：" + s);
        }
    }
}
