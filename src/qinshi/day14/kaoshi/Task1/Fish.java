package qinshi.day14.kaoshi.Task1;



/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Fish
 * @Date 2021/1/18 19:13
 */
public class Fish extends Animal implements Swimmable{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("🐟游泳");
    }
}
