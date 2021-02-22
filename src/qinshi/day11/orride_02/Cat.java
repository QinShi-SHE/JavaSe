package qinshi.day11.orride_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Cat
 * @Date 2021/1/14 11:20
 */
public class Cat extends Animal{
    @Override
    public void move(){  //重写父类的move()方法
        //super.getName();
        System.out.println(super.getName()+" 可以喵喵喵喵"); //super调用父类的方法
    }
}
