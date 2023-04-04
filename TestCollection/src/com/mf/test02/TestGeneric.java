package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 17:07
 * 1.什么是泛型方法：
 * 不是带泛型的方法就是泛型方法
 * 泛型方法有要求：这个方法的泛型的参数类型要和当前的类的泛型无关
 * 换个角度：
 * 泛型方法对应的那个泛型参数类型 和  当前所在的这个类 是否是泛型类，泛型是啥  无关
 * 2.泛型方法定义的时候，前面要加上<T>
 *     原因：如果不加的话，会把T当做一种数据类型，然而代码中没有T类型那么就会报错
 * 3.T的类型是在调用方法的时候确定的
 * 4.泛型方法可否是静态方法？可以是静态方法
 */
public class TestGeneric<E> {
    //不是泛型方法 （不能是静态方法）
    public /*static*/ void a(E e){
    }
    //是泛型方法
    public static <T>  void b(T t){
    }
}

class Demo02 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        TestGeneric<String> tg = new TestGeneric<>();
        tg.a("abc");
        tg.b("abc");
        tg.b(19);
        tg.b(true);
    }
}
