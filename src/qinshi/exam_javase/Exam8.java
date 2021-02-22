package qinshi.exam_javase;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam8
 * @Date 2021/2/3 11:05
 */
public class Exam8 {
    /*
   8，定义两个接口  Swimmable (会游泳)和 Walkable(会跑),里面分别有swim和 walk的行为，
  鱼会游泳，猫会跑，老虎既会游泳也会跑，他们都有名字也都要睡觉。除此之外猫还会上树，老虎能吃人。请写出相关的接口和类并做简单的测试。
   */
   @Test
   public void test() throws Exception{
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

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void sleep(){
        System.out.println("睡觉");
    };
}

interface Swimmable {
    void swim();
}

interface Walkable {
    void walk();
}

class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("🐟游泳");
    }
}

class Cat extends Animal implements Walkable {
    public Cat(String name) {
        super(name);
    }

    void upThree(){
        System.out.println("猫儿上树");
    }

    @Override
    public void walk() {
        System.out.println("猫会跑");
    }
}

class Tiger extends Animal implements Swimmable, Walkable {
    public Tiger(String name) {
        super(name);
    }

    void eatPeople(){
        System.out.println("老虎吃人");
    }

    @Override
    public void swim() {
        System.out.println("老虎游泳");
    }

    @Override
    public void walk() {
        System.out.println("老虎跑路了");
    }
}