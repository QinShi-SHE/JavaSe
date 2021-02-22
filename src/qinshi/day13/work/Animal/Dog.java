package qinshi.day13.work.Animal;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Dog
 * @Date 2021/1/17 17:26
 */
public class Dog extends Animal implements Action{
    @Override
    public void say() {
        System.out.println("汪汪汪");
    }

    @Override
    public void ability() {
        System.out.println("狗狗的接口");
    }
}
