package com.mf.test08;

/**
 * @Auther: mf
 * @Date: 2021/8/7 - 08 - 07 - 23:07
 */
public class TestOuter {
    //1.在局部内部类中访问到的变量必须是被final修饰的
    public void method(){
       final int num=10;
       class A{
           public void a(){
               //num=20;
               System.out.println(num);
           }
       }
    }
    //2.如果类B在整个项目中只使用一次,那么就没有必要单独创建一个B类,使用内部类就可以了
    public Comparable method2() {
        class B implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 100;
            }
        }
        return new B();
    }
    public Comparable method3() {
        //3.匿名内部类:
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
        };
    }
    public void teat(){
       Comparable com= new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 200;
            }
       };
        System.out.println(com.compareTo("abc"));
    }
}
class Test{
    //这是一个main方法,是程序的入口:
    public static void main(String[] args) {
        TestOuter t=new TestOuter();
        t.teat();

    }

}

