package qinshi.day12.polymorphic_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/15 15:36
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Person();
//        p.feedDog(new Dog1()); //调用喂狗的方法，将匿名对象做实际参数
//        p.feedDog(new Dog2());

        p.feedDog(new Dog1());
        p.feedDog(new Dog2());
        p.feedDog(new Dog3());
    }
}
