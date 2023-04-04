package com.mf.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: mf
 * @Date: 2022/12/3 - 12 - 03 - 9:20
 */
public class Test01 {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) throws UnknownHostException {
        //封装IP：
        //InetAddress ia = new InetAddress();不能直接创建对象，因为InetAddress()被default修饰了。
        InetAddress ia = InetAddress.getByName("172.18.128.225");//直接类名.方法名调用,返回一个InerAddress类型
        System.out.println(ia);
        InetAddress ia2 = InetAddress.getByName("localhost");//localhost指代的是本机的ip地址
        System.out.println(ia2);
        InetAddress ia3 = InetAddress.getByName("127.0.0.1");//127.0.0.1指代的是本机的ip地址
        System.out.println(ia3);
        InetAddress ia4 = InetAddress.getByName("LAPTOP-S5R37I7J");//封装计算机名
        System.out.println(ia4);
        InetAddress ia5 = InetAddress.getByName("www.baidu.com");//封装域名
        System.out.println(ia5);
        System.out.println(ia5.getHostName());//获取域名
        System.out.println(ia5.getHostAddress());//获取ip地址
    }
}
