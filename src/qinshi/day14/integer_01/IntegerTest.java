package qinshi.day14.integer_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IntegerTest
 * @Date 2021/1/18 10:37
 */
/*
    包装类：
        给8大基本数据类型提供的类
        int Integer
        char  Character
        其他的将首字母大写

    主要学习方法和构造方法、全局常量

    Integer 整型包装类
    Integer 类在对象中包装了一个基本类型 int 的值。Integer 类型的对象包含一个 int 类型的字段。
    此外，该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，还提供了处理 int 类型时非常有用的其他一些常量和方法。

    构造方法
        Integer(int value)
          构造一个新分配的 Integer 对象，它表示指定的 int 值。
       Integer(String s)
          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。

    常用方法：
        byteValue()
          以 byte 类型返回该 Integer 的值
        intValue()
          以 int 类型返回该 Integer 的值。
        parseInt(String s)
          将字符串参数作为有符号的十进制整数进行解析。
        valueOf(int i)
          返回一个表示指定的 int 值的 Integer 实例。
        valueOf(String s)
          返回保存指定的 String 的值的 Integer 对象。
 */
public class IntegerTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);  //打印最大值

        //通过构造方法创建对象
        Integer i1=new Integer(12);
        System.out.println(i1+1); //打印13，重写了toString方法

        Integer i2=new Integer("12");
        System.out.println(i2+1);

        //这个字符串的值不能乱写
        //java.lang.NumberFormatException 数字格式化异常
        //Integer i3=new Integer("琴师");
       // System.out.println(i3);  //编译不报错，运行报错

        //将Iteger转换为byte
        System.out.println(i1.byteValue());
        //将Integer转换为int
        System.out.println(i1.intValue());

        //类名.方法名(),调用static修饰的方法
        int age=Integer.parseInt("30");
        System.out.println(age);
        System.out.println(Integer.parseInt("134",8)); //第二个参数是当前第一个数的进制数，然后转换为10进制的数

        //将int的值转换为Integer类型
        int a=10;
        Integer aa=Integer.valueOf(a);
        System.out.println(aa);
    }
}
