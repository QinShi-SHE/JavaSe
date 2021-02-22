package qinshi.day12.polymorphic_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Person
 * @Date 2021/1/15 15:36
 */
public class Person {
    //下面三个方法，实现人给不同的狗喂食的方法，但是有很多的狗就不好办
//    void feedDog(Dog1 dog1){
//        dog1.eat();
//    }
//    void feedDog(Dog2 dog2){
//        dog2.eat();
//    }
//    void feedDog(Dog3 dog3){
//        dog3.eat();
//    }

    //这种方法，直接传父类对象，可以接收所有子对象  多态的运用
    void feedDog(Dog dog){
        dog.eat();
    }
}
