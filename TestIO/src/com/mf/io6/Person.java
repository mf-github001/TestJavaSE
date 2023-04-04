package com.mf.io6;

import java.io.Serializable;

/**
 * @Auther: mf
 * @Date: 2022/11/29 - 11 - 29 - 20:49
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 8027651838638826533L;
    private transient String name;
    private static int age;
    private Famaily f = new Famaily();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person() {
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", f=" + f + ",age=" + age +
                '}';
    }
}
