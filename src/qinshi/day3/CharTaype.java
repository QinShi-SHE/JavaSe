package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName CharTaype
 * @Date 2021/1/2 23:43
 */

/**
 * 字符型：
 * 		char   16bit
 * 		一个字符 数字 占一个字节
 * 		中文占 俩个字节
 * 		char里面只能放一个中文
 *
 * 数字对应的字符：
 * 	65-90   A-Z
 *  97-122  a-z
 *  48-57   0-9(字符)
 * 字符的值一定要加单引号
 */
public class CharTaype {
    public static void main(String[] args) {
        //基本用法
        char a1='A';
        char a2='女';
        char a3='1';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        //ASCII转对应字符
        char a=97;
        char A=65;
        System.out.println("字符型a="+a);
        System.out.println("字符型A="+A);
        //字符转对应ASCII
        int b='b';
        int B='B';
        System.out.println("整型b="+b);
        System.out.println("整型B="+B);
    }
}
