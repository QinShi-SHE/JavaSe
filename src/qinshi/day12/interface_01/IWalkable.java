package qinshi.day12.interface_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IWalkable
 * @Date 2021/1/15 10:01
 */

/*
接口可以认为是一种特殊的类，但是定义类的时候使用 class 关键字，定义接口使用 interface 关键字。
public interface 接口名{
抽象方法 1();
抽象方法 2();
抽象方法 2();
}
 */
public interface IWalkable {
    void walk(); //可以不写public 默认为公共的，且只能是public
}
/*
接口中的方法都是公共的抽象方法，等价于：
public interface IWalkable {
public abstract void walk();
}
}
 */

interface ISwimable{
    void swim();
}


//类可以继承类，但是只能单继承的，接口也可以继承接口，但是却可以继承多个接口，也就是说一个
//子接口能继承所有父接口的方法
interface IAmphibiable extends IWalkable,ISwimable{  //接口可以同时继承多个接口，如两栖动物可以行走也可以拥有。

}