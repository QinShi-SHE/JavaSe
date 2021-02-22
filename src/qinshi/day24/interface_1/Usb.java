package qinshi.day24.interface_1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Usb
 * @Date 2021/2/2 9:28
 */
/*
接口
   属性：默认为全局常量
   方法：
        普通方法
            static
            default
        抽象方法

    方法调用
        方法名（）  前提同一个类
        类名.方法名（)  前提有static 修饰
        对象名.方法名（）

     调用接口的抽象方法
            实现类实现
            匿名内部类
函数式接口(Functional Interface)
    就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。

验证是否为函数式接口
    使用注解@FunctionalInterface标记该接口为函数式接口
 */
@FunctionalInterface
public interface Usb {
    //抽象方法 默认被public abstract修饰
    void get();
    //普通方法 static
    public static void get2(){
        System.out.println("有static修饰");
    }
    //普通方法 default
    public default void get3(){
        System.out.println("有default修饰");
    }
}
