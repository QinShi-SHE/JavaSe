package qinshi.day13.work.Animal;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Cat
 * @Date 2021/1/17 17:26
 */
public class Cat extends Animal implements Action{
    @Override
    public void ability() {
        System.out.println("猫儿的接口");
    }

    @Override
    public void say() {
        System.out.println("喵喵喵");
    }
}
