package qinshi.day11.orride_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/14 11:10
 */
public class Test {
    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit();
        rabbit.setName("小兔叽");
        rabbit.move(); //重写了

        Cat cat=new Cat();
        cat.setName("猫儿");
        cat.move(); //重写了

        Dog dog=new Dog();
        dog.setName("狗狗");
        dog.move();  //没有重写

        rabbit.print();
    }
}
