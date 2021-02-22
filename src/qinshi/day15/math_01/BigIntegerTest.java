package qinshi.day15.math_01;

import java.math.BigInteger;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BigIntegerTest
 * @Date 2021/1/20 9:36
 */
/*
不可BigInteger:不可变变的任意精度的整数

BigInteger(String val)
          将 BigInteger 的十进制字符串表示形式转换为 BigInteger
BigInteger add(BigInteger val)
          返回其值为 (this + val) 的 BigInteger。
BigInteger divide(BigInteger val)
          返回其值为 (this / val) 的 BigInteger。
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        //传入字符串类型的整数(只能是整数),返回BigInteger类型
        System.out.println(new BigInteger("111134354353342543543543"));//可以放任意位数
        BigInteger b1=new BigInteger("10");
        BigInteger b2=new BigInteger("3");
        //打印对象出现值，是因为重写了toString方法
        System.out.println(b1);

        //b1="11";  //错误，因为BigInteger类型的值不可变

        //调用加法运算
        System.out.println(b1.add(b2));
        //在BigInteger中不能这样
        //System.out.println(b1+b2);

        //调用除法运算,返回的是整数(向下取整，保留整数位)
        System.out.println(b1.divide(b2)); //3
    }
}
