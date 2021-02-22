package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Vehicle
 * @Date 2021/1/17 16:16
 */
/*
属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型），并且所有属性为私有。
至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
为私有属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
定义一个一般方法run()，用打印语句描述汽车奔跑的功能
定义测试类VehicleTest，在其main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
 */
public class Vehicle {
    private final  String brand;
    private String color;
    private double speed;
    Vehicle(String brand){

        this.brand = brand;
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed =0;
    }

    public  String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    void run(){
        System.out.println("汽车奔跑");
    }

}
