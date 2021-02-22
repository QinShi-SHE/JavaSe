package qinshi.day12.interface_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Usb
 * @Date 2021/1/15 10:07
 */

/*
接口和类比较类似
关键字 interface
接口用于定义规则，自己不实现任何功能，只做定义

接口语法
    public interface 接口名{
    }

类中有
    成员变量；定义在类中的变量
    局部变量
    普通方法
    构造方法
    抽象方法

接口中有
    有成员变量，但是要赋予初始值，并且这个变量的值不能被修改
    有普通方法，但是只有Jdk1.8以后才有
        1.需要加上default修饰
        2.需要加上static修饰
     由抽象方法，默认是加上了abstract
    没有构造方法

字节码文件
    以.class结尾的文件成为字节码文件
    接口也会产生字节码文件
 */
public interface Usb {
    //不能更改，全局常量
    int a=1;

    //1.需要带default修饰的普通方法
    public default void get1(){
        System.out.println("这是default修饰的普通方法");
    }

    //2.需要带static修饰的普通方法
    public static void get2(){
        System.out.println("这是static修饰的普通方法");
    }

    //抽象方法，默认有abstract修饰，所以不用写
    public void get3();

    void get4();

}
