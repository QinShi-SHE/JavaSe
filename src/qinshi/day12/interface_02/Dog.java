package qinshi.day12.interface_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Dog
 * @Date 2021/1/15 14:08
 */
//父类在前，接口在后
public class Dog extends Animal implements IRun,ISwing{
    @Override
    public void run() {
        System.out.println("跑");
    }

    @Override
    public void swing() {
        System.out.println("游");
    }
}
