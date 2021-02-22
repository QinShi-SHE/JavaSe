package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RectangleTest
 * @Date 2021/1/11 16:35
 */
public class RectangleTest {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle();
        r1.width=2;
        r1.height=3;
        System.out.println("长方形1的面积是："+r1.getArea());

        Rectangle r2=new Rectangle(3,4);
        System.out.println("长方形2的面积是："+r2.getArea());

    }
}
