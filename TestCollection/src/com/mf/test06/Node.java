package com.mf.test06;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 20:07
 */
public class Node {//节点类
    //三个属性:
    //上个元素的地址:
    private Node pre;
    //当前存入的元素:
    private Object obj;
    //下一个元素地址
    private Node next;

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
