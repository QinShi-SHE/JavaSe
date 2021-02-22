package qinshi.day15.date_04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Calendar
 * @Date 2021/1/20 15:53
 */
/*
Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，
         并为操作日历字段（例如获得下星期的日期）提供了一些方法。瞬间可用毫秒值来表示，它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00.000，格里高利历）的偏移量。

static Calendar getInstance()
          使用默认时区和语言环境获得一个日历。

 int get(int field)
          返回给定日历字段的值。
 void set(int field, int value)
          将给定的日历字段设置为给定值。

abstract  void add(int field, int amount)
          根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 */
public class CalendarTest {
    public static void main(String[] args) {

        Calendar x=Calendar.getInstance();  //创建对象
        System.out.println(x);

        int year=x.get(Calendar.YEAR);
        int month=x.get(Calendar.MONTH)+1;
        int day=x.get(Calendar.DAY_OF_MONTH);
        int week=x.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(year+"年"+month+"月"+day+"日"+" 星期:"+week);

        x.set(Calendar.YEAR,2020); //设置时间
        System.out.println(x.get(Calendar.YEAR));

        x.add(Calendar.YEAR,-1); //增加或减少
        System.out.println(x.get(Calendar.YEAR));

        //LocalDate 1.8以后才有的
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }
}
