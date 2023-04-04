package com.mf.test01;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 9:42
 */
public class Test02 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
//        InetSocketAddress  ---》封装了IP，端口号
        InetSocketAddress isa = new InetSocketAddress("172.18.128.225",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());//获取计算机名称
        System.out.println(isa.getPort());//获取端口号

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());//获取计算机名称
        System.out.println(ia.getHostAddress());//获取ip地址
    }
}
