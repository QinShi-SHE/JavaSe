package qinshi.day15.date_04;

import java.util.Date;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DateTest
 * @Date 2021/1/20 14:27
 */
/*
Date(long date)
          分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
 */
public class DateTest {
    public static void main(String[] args) {

        System.out.println(new Date());  //打印当前时间

        long mills=System.currentTimeMillis();   //获取当前日期的毫秒数
        Date date=new Date(mills);
        System.out.println(date);
    }
}
