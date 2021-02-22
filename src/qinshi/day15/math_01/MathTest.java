package qinshi.day15.math_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MathTest
 * @Date 2021/1/20 9:16
 */
/*
Math数学类
    用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
常量字段：
      PI
        比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值。
常用方法：
    static double abs(double a)
          返回 double 值的绝对值。
    static double cbrt(double a)
          返回 double 值的立方根。
    static double ceil(double a)
          返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
    static double floor(double a)
          返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。
    static double pow(double a, double b)
          返回第一个参数的第二个参数次幂的值。
    static double random()
          返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
 */
public class MathTest {
    public static void main(String[] args) {
        //获取圆周率
        System.out.println(Math.PI);
        //返回绝对值
        System.out.println(Math.abs(-3));
        //求一个数的立方根
        System.out.println(Math.cbrt(8));  //2.0, 2的立方是8
        //向上取整，返回double类型
        System.out.println(Math.ceil(3.01));  //4.0
        //向下取整
        System.out.println(Math.floor(3.99));  //3.0
        //取两个数的最大值
        System.out.println(Math.max(6,8));
        //求一个数大的几次方,返回double类型
        System.out.println(Math.pow(3,3));
        //随机数0.0~1.0之间,大于等于0且小于1，取不到1
        System.out.println(Math.random());

    }
}
