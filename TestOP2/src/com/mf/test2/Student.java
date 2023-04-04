package com.mf.test2;

/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 22:22
 */
public class Student {
    //属性:
    private int age;
    private String name;
    private String sex;

    //加入对应的setter和getter方法:
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        //增加条件判断
       if("男".equals(sex)||"女".equals(sex)){//sex是男或者是女
           this.sex = sex;
       }else{
           this.sex="男";
       }
    }
     //加入构造器
     public Student(){

     }
     public Student (int age,String name,String sex){
        this.age=age;
        this.name=name;
//        this.sex=sex;
         //直接调用方法:
        this.setSex(sex);
     }
}
