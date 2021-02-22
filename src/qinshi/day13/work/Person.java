package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Person
 * @Date 2021/1/17 14:02
 */
/*
、定义两个类，描述如下：
定义一个人类Person：
定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
有三个属性：名字、身高、体重
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(){

    }
    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    void sayHello(){
        System.out.println("hello,my name is "+getName());
    }
}
