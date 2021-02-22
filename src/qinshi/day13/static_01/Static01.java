package qinshi.day13.static_01;

import qinshi.day12.polymorphic_04.Son;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Static01
 * @Date 2021/1/17 10:09
 */
/*
static概念：
        关键字、修饰符，表示静态的
作用：
    1.	可以修饰普通方法
    2.	可以修饰字段[ 成员变量 ]
    3.	可以修饰内部类
    4.	不可以修饰外部类
    5.	不可以修饰局部变量；
    6.	不可以修饰构造方法

static修饰后的访问
               全局变量
                        不在同一个类中，类名.类中成员（变量、方法）
                        在同一个类中，属性名
               方法
                    在同一个类中，方法名
                    不在同一个类中，类名.类中成员（变量、方法）

 */
public class Static01 {
    static String name;   //可以修饰字段[ 成员变量 ]
    public static void get(){  //可以修饰普通方法
        //static int age=10;  //不可以修饰局部变量；
        int age=10;
    }

    static  class A{  //可以修饰内部类，内部类会生成字节码文件
        void get2(){
            get(); //在同一个类中，方法名
        }
    }

    public Static01(){}  //不可以修饰构造方法

    public static void main(String[] args) {
        System.out.println(Static01.name);
        System.out.println(name);
    }
}

//static class B{   //不可以修饰外部类
//
//}
class B{
    void get3(){
        Static01.get(); //不在同一个类中，类名.类中成员（变量、方法）
    }
}
