package qinshi.day12.polymorphic_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/15 14:24
 */
/*
多态：
    一个事物，有多种形态

中文描述
    一个人是一个动物
    Animal an=new Person();
    一头猪是一个动物
    Animal an=new Pig();
    一个动物是一个人
    Person p1=new Animal();
    一个动物是一头猪
   Pig p2=new Animal();
    一头猪是一个人
    Person p3=new Pig();

怎么看多态
    前提：有继承关系，才会有多态
    编译和运行时类型不一致的情况就是多态
    编译看左边，运行看右边
    父类的引用指向子类的对象
 */
public class Test {
    public static void main(String[] args) {
        //正常情况下
        Person person=new Person();
        Pig pig=new Pig();

        //小到大
        Animal an=new Person();
        Animal an2=new Pig();

        //语法不支持
        //大到小，强转
        //Person p1= (Person) new Animal();
        //Pig p2= (Pig) new Animal();
        //Person p3=new Pig();

        /*
            多态的使用，编译看左边，运行看右边
            编译看左边（在编译的时候，看父类有没有这个方法或属性）
            运行看右边（在运行的时候，看子类有没有这个方法或属性，有就调用自己的，没有就找父类的）
         */
        Animal animal=new Person();
        animal.eat(); //子类有，调用自己的
        an.sleep(); //子类没有，调用父类的
    }
}
