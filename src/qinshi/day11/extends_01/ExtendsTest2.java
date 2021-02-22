package qinshi.day11.extends_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ExtendsTest2
 * @Date 2021/1/14 10:31
 */
public class ExtendsTest2 {
    /*
           语法格式：
                    class 子类 extends 父类{}
           继承的特点
                    1.单继承(一个类只能够有一个直接父类)
                    2.多重继承(多层级的继承), 一个类可以有子类,子类还可以子类...
                    3.每一个类都有一个直接父类,如果没有看到显示的继承代码,那么就隐式继承Object
     */
    public static void main(String[] args) {
        BoyStudent boyStudent=new BoyStudent();
        boyStudent.toString(); //toString 就是Object类中的方法
    }
}

class Animal{  //没有显示继承，默认继承Object

}

class Person {

}

class Student extends Person{

}

class BoyStudent extends Student{

}
