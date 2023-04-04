package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2021/8/5 - 08 - 05 - 18:26
 */
public class PetStore {//宠物店
    //方法:提供动物:
    public static Animal getAnimal(String petName){//多态的应用场合(二)
        Animal an = null;

        if("猫".equals(petName)){//petName.equals("猫")---->这样写容易发生空指针异常
            an=new Cat();
        }
        if("狗".equals(petName)){
            an=new Dog();
        }
        if("猪".equals(petName)){
            an=new Pig();
        }
        return an;

    }

}
