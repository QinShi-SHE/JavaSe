package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName CarTest
 * @Date 2021/1/11 19:19
 */
public class CarTest {
    /*       （1）创建一个叫做机动车的类：
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
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car("渝B5086",150,200);

        car1.changeNum("渝A9752");  //调用修改车牌号
        car1.addSpeed();  //调用加速方法

        car2.lessenSpeed();  //调用减速方法

        System.out.print("car1的车牌号为："+car1.getCarnum()+"，车速为："+car1.getSpeed());
        car1.selectWeight();

        System.out.print("car2的车牌号为："+car2.getCarnum()+"，车速为："+car2.getSpeed());
        car2.selectWeight();
    }
}
