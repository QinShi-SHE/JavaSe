package qinshi.day14.kaoshi.Task1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Cat
 * @Date 2021/1/18 19:11
 */
public class Cat extends Animal implements Walkable{
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
