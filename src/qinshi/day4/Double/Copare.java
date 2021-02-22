package qinshi.day4.Double;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Copare
 * @Date 2021/1/4 15:06
 */
public class Copare {
/*
       关系运算符（比较运算符）

==	检查如果两个操作数的值是否相等，如果相等则条件为真。	（A == B）为假。
!=	检查如果两个操作数的值是否相等，如果值不相等则条件为真。	(A != B) 为真。
> 	检查左操作数的值是否大于右操作数的值，如果是那么条件为真。	（A> B）为假。
< 	检查左操作数的值是否小于右操作数的值，如果是那么条件为真。	（A <B）为真。
>=	检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。	（A> = B）为假。
<=	检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。	（A <= B）为真。
 */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
    }
}
