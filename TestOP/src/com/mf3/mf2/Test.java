package com.mf3.mf2;

/**
 * @Auther: mf
 * @Date: 2021/7/22 - 07 - 22 - 12:59
 */
public class Test {
    //����һ��main����,�ǳ�������:
    public static void main(String[] args) {
        /*
        1.һ�㱣֤�չ������Ĵ���,�չ�������һ�㲻��������Եĸ�ֵ����
        2.һ�����ǻ����ع�����,�����صĹ������н������Ը�ֵ����
        3.�����ع������Ժ�,����չ�������д��,ϵͳҲ����������Ĭ�ϵĿչ�������,��ô��Ҫ���õĻ��ͻ����.
        4.���β����ֺ���������������ʱ��,����־ͽ�ԭ��:
        ��Ҫ��ʾ���������ǰ����this.������,��Ϊthis����ľ����㴴�����Ǹ�����
        */
        Person p=new Person();
      /*  p.age=19;
        p.name="lili";
        p.height=180.4;*/
        Person p2=new Person("xmlll",18,165.1);
        System.out.println("����:"+p2.age);
        System.out.println("����:"+p2.name);
        System.out.println("���:"+p2.height);

        p2.eat();
    }

}
