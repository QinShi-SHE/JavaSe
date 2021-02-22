package qinshi.day12.work.poly;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Truck
 * @Date 2021/1/15 14:21
 */
public class Truck extends Car{
    @Override
    void run() {
        System.out.println("80km/h");
    }

    void transportGoods(){
        System.out.println("运输货物");
    }
}
