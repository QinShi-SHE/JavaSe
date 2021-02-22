package qinshi.exam_javase;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam9
 * @Date 2021/2/3 11:55
 */
public class Exam9{
    /*
        9,在第八题的基础上，将接口定义为函数式接口，里面分别有swim和 walk的行为，
        使用lambda表达式来进行简化，采用匿名内部类、简化方式1、简化方式2来完成操作
     */
    @Test
    public void test() throws Exception{
        //采用匿名内部类
        new Swimmable2() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        }.swim();
        //简化1
        Swimmable2 s1=() -> {
            System.out.println("游泳1");
        };
        s1.swim();
        //简化2
        Swimmable2 s2=() -> System.out.println("游泳2");
        s2.swim();

        //采用匿名内部类
        new Walkable2() {

            @Override
            public void walk() {
                System.out.println("跑");
            }
        }.walk();
        //简化1
        Walkable2 w1=() -> {
            System.out.println("跑1");
        };
        w1.walk();
        //简化2
        Walkable2 w2=() -> System.out.println("跑2");
        w2.walk();
    }
}

interface Swimmable2 {
    void swim();
}
interface Walkable2 {
    void walk();
}