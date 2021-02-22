package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName VehicleTest
 * @Date 2021/1/17 17:08
 */
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car=new Vehicle("benz","black");
        car.run();
        System.out.println("品牌:"+car.getBrand()+" 颜色"+car.getColor()+" 初始速度:"+car.getSpeed());
    }
}
