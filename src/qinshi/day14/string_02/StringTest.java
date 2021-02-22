package qinshi.day14.string_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringTest
 * @Date 2021/1/18 14:17
 */
/*
字符串
    String
    String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
    字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享。例如：

     String str = "abc";
     等效于：
     char data[] = {'a', 'b', 'c'};
     String str = new String(data);

    String的值不能被修改,因为字符串的底层是由字符数组组成的，并且被final修饰的
    String不可变字符串，要改变就只能重新赋予一个值
 */
public class StringTest {
    public static void main(String[] args) {
        System.out.println("abc");
        String s="琴师";  //字符串的值不能被改
        //重写了tosting方法
        System.out.println(s.hashCode());
        s="妈妈哈哈";  //被改就会重新创建一个新的地址值
        System.out.println(s.hashCode());

        String s1=new String();
        s1="无参构造";
        System.out.println(s1);

        //日常开发常用的方式
        String str="11";
        //等价于
        String str1=new String("11");
    }
}
