package qinshi.day9.work;

import sun.plugin.dom.DOMObject;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Dog
 * @Date 2021/1/11 16:42
 */
public class Dog {
    /*
         定义一个狗狗类，狗狗
        有如下属性：性别，姓名
        有如下方法： void eat(String food)方法
     */

    String name,sex;

    Dog(){};

    Dog(String name,String sex){
        this.name=name;
        this.sex=sex;
    }

    void eat(String food){
        System.out.println(food);
    }
}
