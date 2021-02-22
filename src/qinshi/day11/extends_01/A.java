package qinshi.day11.extends_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName A
 * @Date 2021/1/14 13:26
 */
public class A {
    void eat() {
        System.out.println("animal : eat");
    }
}
class Dog extends A {
    void eat() {
        System.out.println("dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
    }
}

 class Test {
    public static void main(String[] args) {
        A a = new A();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}