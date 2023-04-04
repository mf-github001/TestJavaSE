package com.mf.test02;

/**
 * @Auther: mf
 * @Date: 2022/11/7 - 11 - 07 - 16:44
 * GenericTes就是一个普通的类
 * GenericTest<E> 就是一个泛型类
 * <>里面就是一个参数类型，但是这个类型是什么呢？这个类型现在是不确定的，相当于一个占位
 * 但是现在确定的是这个类型一定是一个引用数据类型，而不是基本数据类型
 */
public class GenericTest<E> {
    int age;
    String name;
    E sex;
    public void a(E n){
    }
    public void b(E[] m){
    }
}
class Test{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //GenericTest进行实例化：
        //(1)实例化的时候不指定泛型：如果实例化的时候不明确的指定类的泛型，那么认为此泛型为Object类型
        GenericTest gt1 = new GenericTest();
        gt1.a("abc");
        gt1.a(17);
        gt1.a(9.8);
        gt1.b(new String[]{"a","b","c"});
        //（2）实例化的时候指定泛型：---》推荐方式
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.sex = "男";
        gt2.a("abc");
        gt2.b(new String[]{"a","b","c"});

    }
}
class SubGenericTest extends GenericTest<Integer>{
}
class Demo{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //指定父类泛型，那么子类就不需要再指定泛型了，可以直接使用
        SubGenericTest sgt = new SubGenericTest();
        sgt.a(19);
    }
}
class SubGenericTest2<E> extends GenericTest<E>{
}
class Demo2{
        //这是main方法，程序的入口
        public static void main(String[] args){
        SubGenericTest2<String> s=new SubGenericTest2<>();
        s.a("abc");
        s.sex="女";
        }
}