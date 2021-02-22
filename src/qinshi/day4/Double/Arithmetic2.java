package qinshi.day4.Double;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Arithmetic2
 * @Date 2021/1/4 14:55
 */
public class Arithmetic2 {
    public static void main(String[] args) {
        /*
           算术运算符
                 +	加法 - 相加运算符两侧的值
                 -	减法 - 左操作数减去右操作数
                 *	乘法 - 相乘操作符两侧的值
                /	除法 - 左操作数除以右操作数
                ％	取余 - 左操作数除以右操作数的余数
                ++	自增: 操作数的值增加1
                --	自减: 操作数的值减少1
         */

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );
    }
}
