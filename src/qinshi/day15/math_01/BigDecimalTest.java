package qinshi.day15.math_01;

import java.math.BigDecimal;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BigDecimal
 * @Date 2021/1/20 10:12
 */
/*
BigDecimal(String val)
          将 BigDecimal 的字符串表示形式转换为 BigDecimal。
BigDecimal divide(BigDecimal divisor)
          返回一个 BigDecimal，其值为 (this / divisor)，其首选标度为 (this.scale() - divisor.scale())；如果无法表示准确的商值（因为它有无穷的十进制扩展），则抛出 ArithmeticException。
      BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
          返回一个 BigDecimal，其值为 (this / divisor)，其标度为指定标度。
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal b1=new BigDecimal("10.0");
        BigDecimal b2=new BigDecimal("3.0");
        System.out.println(b1);
        //System.out.println(b1.divide(b2));  //除不尽的情况下需要明确保留的位数
        System.out.println(b1.divide(b2,2,BigDecimal.ROUND_DOWN));//第二个参数小数位数，第三个参数舍入模式
    }
}
