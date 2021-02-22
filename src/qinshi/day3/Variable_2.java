package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Variable_2
 * @Date 2021/1/2 22:24
 */

/*
    注意：
        变量的数据类型可以是byte、short、int、long、float、double、char、boolean
        数据类型限定了变量可以存值的类型
        赋值使用=,从右往左赋值
        规范：一般 = 左右都有一个空格
        变量定义好了，可以反复使用
        变量只能存一次值，下次赋值会覆盖上一次的值
*/
public class Variable_2 {
    public static void main(String[] args) {
      int a;
      a = 2;
      a = 4;
      System.out.println(a);
      a = 6;
      System.out.println(a);
    }
}
