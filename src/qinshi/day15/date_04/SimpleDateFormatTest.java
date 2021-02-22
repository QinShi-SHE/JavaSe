package qinshi.day15.date_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SimpleDateFormat
 * @Date 2021/1/20 15:02
 */
/*
SimpleDateFormat 使得可以选择任何用户定义的日期-时间格式的模式

SimpleDateFormat()
          用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。

 Date parse(String text, ParsePosition pos)
          解析字符串的文本，生成 Date。
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //定义一个时间
        Date time =new Date();

        //将日期转换为xxxx年xx月xx日 时 分 秒
        SimpleDateFormat stime=new SimpleDateFormat();
        //默认的
        String s=stime.format(time);
        System.out.println(s);

        //自定义
        SimpleDateFormat stime2=new SimpleDateFormat("y年M月D日 H:时:m分:s秒 E");
        System.out.println(stime2.format(time));

        //还原系统的时间格式
        String str="2021年1月20日 15:时:1分:12秒 星期三";  //上下两种格式必须一致
        SimpleDateFormat stime3=new SimpleDateFormat("y年M月D日 H:时:m分:s秒 E");
        System.out.println(stime3.parse(str)); //解析时间

    }
}
