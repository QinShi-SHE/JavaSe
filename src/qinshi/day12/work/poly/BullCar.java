package qinshi.day12.work.poly;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BullCar
 * @Date 2021/1/15 14:21
 */
public class BullCar extends Car{
    @Override
    void run() {
        System.out.println("10km/h");
    }

    void eatGrass(){
        System.out.println("吃草");
    }
}
