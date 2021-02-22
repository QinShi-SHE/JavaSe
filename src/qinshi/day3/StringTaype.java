package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringTaype
 * @Date 2021/1/2 23:58
 */

/**
 * 引用数据类型
 * 		类
 * 			自定义的类
 * 			java自带的类（String）
 * String  字符串类型
 * 拼接一个数字
 */
public class StringTaype {
    public static void main(String[] args) {
        //从左到右一次执行
        System.out.println(1+2+"琴");//1+2，整型相加
        System.out.println(1+"琴"+2);
        System.out.println("琴"+1+2);//琴+1，变成字符串
    }
}
