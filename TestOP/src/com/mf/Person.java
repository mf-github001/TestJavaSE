package com.mf;

/**
 * @Auther: mf
 * @Date: 2021/7/20 - 07 - 20 - 17=53
 * �����ࣺ����
 */
public class Person {
    //����--->����(ע��:����ֻ������Ҫ������д��������,����صĶ�����Ҫ���ڴ�����)
    int age;//����
    String name;//����
    double height;//���
    double weight;//����

    //����---->����
    //�Է�
    public void eat() {
        int num = 10;//�ֲ�����:���ڷ�����
        System.out.println("��ϲ���Է�");
    }

    //˯��:
    public void sleep(String adderss) {
        System.out.println("����" + adderss + "˯��");
    }

    //���ҽ���
    public String introduce() {
        return   "�ҵ�������:" + name + ",�ҵ�������" + age + ",�ҵ������:" + height + ",�ҵ�������:" + weight;
    }
}

