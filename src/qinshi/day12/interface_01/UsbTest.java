package qinshi.day12.interface_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName UsbTest
 * @Date 2021/1/15 10:21
 */

/*
类的方法调用时
    类名.方法名()  方法要被static修饰
    对象名.方法名() 创建对象出来，通过构造方法来创建对象
接口调用、
    调用接口中的成员变量（即全局常量），必须要有变量去接收，或者直接打印
    接口名.方法名()
    调用default修饰的方法，需要一个类去实现接口，然后创建对象，通过对象名.方法()
    抽象方法也是用实现类去调用

 */
public class UsbTest {
    public static void main(String[] args) {
        //调用接口中的用static修饰的方法
        Usb.get2();

        //Usb.a; //报错，调用接口中的成员变量，必须要有变量去接收，或者直接打印
        System.out.println(Usb.a);
        int i=Usb.a;

        //创建实现类的对象
        Mouse m=new Mouse();
        //调用接口中的用default修饰的方法
        m.get1();
        //调用接口中的抽象方法
        m.get3();
    }
}
