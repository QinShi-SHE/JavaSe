package qinshi.day13.work.Animal;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Animal
 * @Date 2021/1/17 17:23
 */
public abstract class Animal {
    //有一个动物类（抽像类Animal），它有两个子类狗类(Dog)和猫类(Cat)实现抽象类Animal，在Animal类中有一个打招呼的方法say()，
    // 让它的两个子类重写父类打招呼的方法，实现各自打招呼的方法。再定义一个接口Action，接口中定义方法ability()，让Dog和Cat实现这个接口。
    public abstract void say();
}
