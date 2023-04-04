package com.mf3.mf2;

/**
 * @Auther: mf
 * @Date: 2021/7/22 - 07 - 22 - 12:59
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        /*
        1.一般保证空构造器的存在,空构造器中一般不会进行属性的赋值操作
        2.一般我们会重载构造器,在重载的构造器中进行属性赋值操作
        3.在重载构造器以后,假如空构造器忘写了,系统也不会给你分配默认的空构造器了,那么你要调用的话就会出错.
        4.当形参名字和属性名字重名的时候,会出现就近原则:
        在要表示对象的属性前加上this.来修饰,因为this代表的就是你创建的那个对象
        */
        Person p=new Person();
      /*  p.age=19;
        p.name="lili";
        p.height=180.4;*/
        Person p2=new Person("xmlll",18,165.1);
        System.out.println("年龄:"+p2.age);
        System.out.println("姓名:"+p2.name);
        System.out.println("身高:"+p2.height);

        p2.eat();
    }

}
