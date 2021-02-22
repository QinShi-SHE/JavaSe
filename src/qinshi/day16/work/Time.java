package qinshi.day16.work;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Time
 * @Date 2021/1/21 19:14
 */
public class Time implements Runnable{

    /*
        写一个时钟在控制台输出如2019年3月13日星期三 12：57：44
        （相当于电子表：秒表时间都能走动）
     */

    @Override
    public void run() {
        //while (true){
            Date time=new Date(); //获取当前的时间
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("y年M月D日 E H:m:s");  //自定义一种日期显示格式
            String newtime=simpleDateFormat.format(time); //调用format方法转换日期,返回的是字符串
            System.out.println(newtime); //打印时间
        //}
    }
}
