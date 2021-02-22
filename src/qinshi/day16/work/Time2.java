package qinshi.day16.work;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Time2
 * @Date 2021/1/22 9:15
 */
public class Time2 implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                Date time=new Date(); //获取当前的时间
                SimpleDateFormat simpleDateFormat=new SimpleDateFormat("y年M月D日 E H:m:s");  //自定义一种日期显示格式
                String newtime=simpleDateFormat.format(time); //调用format方法转换日期,返回的是字符串
                System.out.println(newtime); //打印时间

                new Thread(new Time()).sleep(1000);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
