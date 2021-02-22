package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DrinkTest
 * @Date 2021/1/11 17:56
 */
public class DrinkTest {
    public static void main(String[] args) {
        //主类：初始化100L的水 ，先被喝10升，打印剩余水；然后被喝20升，打印剩余水
        int weter=100;
        Drink drink=new Drink();
        weter-=drink.drinkWeter();
        System.out.println("喝掉10L还剩："+weter+"L");
        weter-=drink.drinkWete2();
        System.out.println("喝掉20L还剩："+weter+"L");
    }
}
