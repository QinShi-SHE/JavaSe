package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Arithmetic
 * @Date 2021/1/3 11:41
 */
public class Arithmetic {
    public static void main(String[] args) {
        /*
                算术运算符：
                    +、-、*、/、%
         */
        System.out.println(1+1);
        System.out.println(1-1);
        System.out.println(1*1);
        System.out.println(1/1);
        System.out.println(1%1);

        //特殊
        System.out.println(10/3); //10和3都是int类型,结果为int类型
        System.out.println(10/3.0); //3.0是double类型，结果肯定为double类型
        System.out.println(10%3); //10除3取余，余数为1
        System.out.println(10%3.0); //3.0为double,所以结果1.o

    }
}
