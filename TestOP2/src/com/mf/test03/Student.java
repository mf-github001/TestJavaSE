package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 23:08
 */
public class Student extends Person{//子类Student 继承  父类Person
    //属性:(只定义特有的即可)
    private int sno;//学号

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //方法:
    public void study(){
        System.out.println("学习");
    }
}
