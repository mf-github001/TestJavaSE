package com.mf.test01;

/**
 * @Auther: mf
 * @Date: 2021/7/24 - 07 - 24 - 17:48
 */
public class Girl {//女孩
    //属性:
    private int age;//年龄
    private int sno;//学号
    private String name;
    private double height;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //读取年龄的方法
    public int getAge(){
        return age;
    }
    //设置年龄
    public void setAge(int age){
        if(age>=18){
          this.age=18;
        }else{
           this.age=age;
          }
    }
}
