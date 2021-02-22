package qinshi.day15.exception_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ExceptionTest
 * @Date 2021/1/20 16:40
 */
/*
Throwable 异常和错误的父类
    Error  错误，程序员解决不了
    Exception  异常，程序员可以解决
         编译时期的异常
         运行时期的异常  RunTimeException

点击异常处理最多的就是编译时期的异常，是为了能够正常的执行
运行时报了错，应该是修改代码

常见的异常
    数组下标越界
    空指针异常，对象为null，并且使用了这个对象去调用方法
    类型转换异常
    算术运算异常  当除以一个为0的数
    数字格式化异常 向方法传递一个不正确或不合法的参数
    解析时异常  解析时出现错误
 */
public class ExceptionTest {
    public static void main(String[] args) throws ParseException {
        // 数组下标越界
        int[] i={1,2};
        //System.out.println(i[3]);

        // 空指针异常，对象为null，并且使用了这个对象去调用方法
        i=null;
        //System.out.println(i.toString());

        // 类型转换异常
        Object x=new Integer(0);
        //System.out.println((String) x);

        // 算术运算异常
        //System.out.println(10/0);
        //System.out.println(10/0.0);  //Infinity 注意除以0.0或者后面更多0，都是Infinity

        // 向方法传递一个不正确或不合法的参数
        //System.out.println(new Integer("a"));

        //解析时异常  解析时出现错误
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH时mm分ss秒 E");
        sdf.parse("fsdfsdf");//ParseException

    }
}
