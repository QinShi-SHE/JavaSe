package qinshi.day20.generic_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName GenericTest
 * @Date 2021/1/25 16:37
 */
/*
定义一个类
    用来表示一个坐标 x  y，可以传入任何类型的值
 */
public class GenericTest2 {
    public static void main(String[] args) {
        //整数型
        Point point1=new Point<Integer,Double>();
        //字符型
        Point point2=new Point<String,Integer>();
    }
}
