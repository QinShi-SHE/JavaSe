package qinshi.day14.kaoshi.Task1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Tiger
 * @Date 2021/1/18 19:12
 */
public class Tiger extends Animal implements Swimmable,Walkable{
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
