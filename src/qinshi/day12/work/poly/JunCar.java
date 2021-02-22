package qinshi.day12.work.poly;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName JunCar
 * @Date 2021/1/15 15:02
 */
public class JunCar extends Car{
    @Override
    void run() {
        System.out.println("150km/h");
    }

    void shooting(){
        System.out.println("放炮");
    }
}
