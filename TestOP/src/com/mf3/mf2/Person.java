package com.mf3.mf2;

/**
 * @Auther: mf
 * @Date: 2021/7/22 - 07 - 22 - 12:55
 */
public class Person {
    //����:
    String name;
    int age;
    double height;
    //�չ�����
    public Person(){

    }
    public Person(String name,int age,double height){
        //���β����ֺ���������������ʱ��,����־ͽ�ԭ��:
        //��Ҫ��ʾ���������ǰ����this.������,��Ϊthis����ľ����㴴�����Ǹ�����
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public Person(String a,int b){
        name=a;
        age=b;
    }
    //����
    public void eat(){
        System.out.println("��Ҫ�Է�");
    }
}
