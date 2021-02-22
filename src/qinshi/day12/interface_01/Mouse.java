package qinshi.day12.interface_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Mouse
 * @Date 2021/1/15 10:29
 */

/*
实现类
     一个类去实现接口，这个类叫实现类
     实现的关键字 implements

和抽象类一样，接口是不能创建对象的，此时必须定义一个类去实现接口，并覆盖接口中的方法，这
个类称之为实现类，类和接口之间的关系称之为实现关系（implements）。

public class 类名 implements 接口名 1,接口名 2{
覆盖接口中抽象方法
}

在类实现接口后，覆盖接口中的抽象方法，完成功能代码，此时接口和实现类之间的关系：
接口：定义多个抽象方法，仅仅定义有哪些功能，却不提供实现。
实现类：实现接口，覆盖接口中抽象方法，完成功能具体的实现。

 */
public class Mouse implements Usb {  //实现类必须要实现接口中所有的抽象方法，否则声明为抽象类

    @Override
    public void get3() {
        System.out.println("接口中的抽象方法");
    }

    @Override
    public void get4() {

    }
}
