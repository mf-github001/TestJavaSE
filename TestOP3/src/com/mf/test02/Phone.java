package com.mf.test02;

import java.util.Objects;

/**
 * @Auther: mf
 * @Date: 2021/8/4 - 08 - 04 - 20:03
 */
public class Phone {//手机类：
    //属性:
    private String brand;//品牌型号
    private double price;//价格
    private int year;//出产年份

    //方法:
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    //构造器:
    public Phone() {
    }

    public Phone(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }
//    //对equals方法进行重写:
//    public boolean equals(Object obj) {
//        /*
//        instanceof运算符：
//        a instanceof b:
//        判断a对象是否是b这个类的实例，如果是 返回true  如果不是 返回false
//        */
//        if(obj instanceof Phone){//属于Phone类的对象
//            //将obj转为Phone类型:
//            Phone other=(Phone) obj;//多态讲解
//            if(this.getBrand()==other.getBrand()&&this.getPrice()==other.getPrice()&&this.getYear()==other.getYear()){
//                return true;//return 结束方法!!!
//            }
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 &&
                year == phone.year &&
                Objects.equals(brand, phone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, year);
    }
}
