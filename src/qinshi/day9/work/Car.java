package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Car
 * @Date 2021/1/11 18:54
 */
public class Car {
    /*
        （1）创建一个叫做机动车的类：
            属性：车牌号(String)，车速(int)，载重量(double)
            功能：加速(车速自增)、减速(车速自减)、修改车牌号，查询车的载重量。
            编写两个构造方法：一个没有形参，在方法中将车牌号设置“XX1234”，速
            度设置为100，载重量设置为100；另一个能为对象的所有属性赋值；
            （2）创建主类：
            在主类中创建两个机动车对象。
            创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“渝
            A9752”，并让其加速。
            创建第二个时调用有参数的构造方法，使其车牌为“渝B5086”,车速为150,
            载重为200，并让其减速。
            输出两辆车的所有信息
     */

    private String carnum;
    private int speed;
    private double weight;

    public String getCarnum() {
        return carnum;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //加速
    void addSpeed(){
       speed++;
    }
    //减速
    void lessenSpeed(){
        speed--;
    }
    //修改车牌号
    void changeNum(String carnum){
        this.carnum=carnum;
    }
    //查询载重量
    void selectWeight(){
        System.out.println("，载重量为："+weight);
    }

    public Car() {
        carnum="XX1234";
        speed=100;
        weight=100;
    }

    public Car(String carnum, int speed, double weight) {
        this.carnum = carnum;
        this.speed = speed;
        this.weight = weight;
    }
}
