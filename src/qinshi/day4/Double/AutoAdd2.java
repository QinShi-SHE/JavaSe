package qinshi.day4.Double;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName AutoAdd2
 * @Date 2021/1/4 14:59
 */
public class AutoAdd2 {
/*
       自增自减运算符
            自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。
 */
    public static void main(String[] args) {
        int a = 3;//定义一个变量；
        int b = ++a;//自增运算
        int c = 3;
        int d = --c;//自减运算
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println("进行自减运算后的值等于"+d);

        //前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
        //后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
        int a1 = 5;//定义一个变量；
        int b1 = 5;
        int x = 2*++a1;
        int y = 2*b1++;
        System.out.println("自增运算符前缀运算后a1="+a1+",x="+x);
        System.out.println("自增运算符后缀运算后b1="+b1+",y="+y);
    }
}
