package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2021/8/5 - 08 - 05 - 13:40
 */
public class Test {
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        //具体的小女孩:--->女孩的对象;
        Girl g=new Girl();
        //具体的动物:--->动物的对象
        //Cat c=new Cat();
        // Dog d=new Dog();
        // Pig p =new Pig();

        Animal an=PetStore.getAnimal("猫" );
        g.play(an);
        Animal an2=PetStore.getAnimal("狗");
        g.play(an2);
        Animal an3 =PetStore.getAnimal("猪" );
        g.play(an3);
    }
}
