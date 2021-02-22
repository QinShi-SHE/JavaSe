package qinshi.day11.abstract_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Graph
 * @Date 2021/1/14 14:21
 */
public abstract class AbstractGraph {
    /*
        图像类
            没有属性，因为不能确定写什么东西
        抽象类
            也是一个类，只是被abstract修饰
        抽象方法
            一个方法没有方法体，该方法要声明为抽象方法
            一般用于模板使用
     */

    public abstract  void getArea(); //抽象类中的抽象方法

    public abstract int getArea2();  //抽象类中的抽象方法

    public void eat(){}  //抽象类中的普通方法

    public AbstractGraph(){  //抽象类的构造方法
        System.out.println("抽象类的无参构造");
    }
}
