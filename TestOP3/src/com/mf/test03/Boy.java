package com.mf.test03;

/**
 * @Auther: mf
 * @Date: 2021/8/4 - 08 - 04 - 23:11
 */
public class Boy {
    //属性:
    int age;
    String name;
    //方法:
    public void buy(){
        System.out.println("买个鬼,就不买,谈个鬼恋爱,人生才短短几个秋,不能被爱情绊住脚");
        System.out.println("好男儿,志在四方,姑娘珍重.");
    }
    //构造器:
    public Boy() {
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
