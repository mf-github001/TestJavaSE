package com.mf;

/**
 * @Auther: mf
 * @Date: 2021/7/22 - 07 - 22 - 8:44
 */
public class Test {//������

    //����һ��main����,�ǳ�������:
    public static void main(String[] args) {
      //����һ������ľ������/ʵ��:
      //����һ������,��������ֽ�:zs
      //person ���� ������������:
      //��һ�μ������ʱ��,�������ļ���,��ʼ�����������ʱ��,���������û�и�ֵ,��Ĭ�ϵĳ�ʼ����ֵ.
        Person zs=new Person();
        zs.name="����";
        zs.age=19;
        zs.height=190.1;
        zs.weight=170.4;
        //�ٴ���һ������:
        //�ٴδ�����ʱ��,�Ͳ��������ļ�����,��ļ���ֻ�ڵ�һ����Ҫ��ʱ�����һ��
        Person ls=new Person();
        ls.name="����";
        ls.age=18;
        ls.height=173.0;
        ls.weight=60;
        //������ֵ���ж�ȡ:
        System.out.println(zs.name);
        System.out.println(ls.age);
        //�Է������в���:
        //��ͬ�Ķ���,�������Լ������е�ֵ,���Ƿ������ǵ�������ͨ�õķ���.
        //����:��������������Ƕ�����.
        //����:��������ķ����ǹ����.
        zs.eat();
        ls.eat();
        zs.sleep("����");
       /* String str=zs.introduce();//���ҽ���
        System.out.println("����"+'\n'+str);*/
        System.out.println("����"+'\n'+zs.introduce());
    }
}
