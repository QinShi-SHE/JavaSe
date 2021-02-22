package qinshi.day14.kaoshi.Task1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/18 19:16
 */
public class Test {
    /*
    5，定义两个接口  Swimmable (会游泳)和 Walkable(会跑),里面分别有swim和 walk的行为，
    鱼会游泳，猫会跑，老虎既会游泳也会跑，他们都有名字也都要睡觉。除此之外猫还会上树，老虎能吃人。请写出相关的接口和类并做简单的测试。
     */
    public static void main(String[] args) {
        Cat cat=new Cat("猫儿");
        cat.sleep();
        cat.walk();

        Tiger tiger=new Tiger("老虎");
        tiger.sleep();
        tiger.walk();
        tiger.swim();

        Fish fish=new Fish("鱼儿");
        fish.sleep();
        fish.swim();
    }
}
