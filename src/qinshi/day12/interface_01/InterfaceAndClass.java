package qinshi.day12.interface_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName InterfaceAndClass
 * @Date 2021/1/15 11:15
 */
public class InterfaceAndClass {
    public static void main(String[] args) {
    /*
        接口和类之间的关系：
            接口只是一个规范
            类是去实现接口，这个类就叫做实现类
            接口不能继承类，类不能继承接口


        接口的特点
            接口与接口之间可以继承
            接口与接口之间可以多继承
            接口与接口之间可以多重继承

       类与类之间的关系
            单继承
            多重继承
            隐式继承与object

        即要继承一个类，还要实现一个接口
     */
    }
}

interface A{

}

interface B{

}

class X{

}

class C implements A {

}

//接口的单继承
interface D extends A{

}

//接口的多继承
interface H extends D{

}

//接口的多重继承
interface E extends A,B{

}