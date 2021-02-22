package qinshi.day17.timer_01;

import java.util.Date;
import java.util.Timer;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TimerTest
 * @Date 2021/1/22 9:39
 */
/*
Timer      定时器
TimerTask    定时任务   抽象类

 void schedule(TimerTask task, Date time)
          安排在指定的时间执行指定的任务。
 void schedule(TimerTask task, Date firstTime, long period)
          安排指定的任务在指定的时间开始进行重复的固定延迟执行。

在定时器中执行定时的任务
    1.创建一个类，继续TimerTask
    2.重写run方法
    3.创建定时器对象
    4.创建定时任务的对象，当作参数使用
    4.调用相关的方法来执行
 */
public class TimerTest {
    public static void main(String[] args) {
        //创建定时器对象
        Timer t=new Timer();
        //t.schedule(new MyTimerTask(),new Date());  //new Date()当前时间,会一直执行

        MyTimerTask task=new MyTimerTask();
        //t.schedule(task,2000); //2秒后执行

        //重复执行同一个任务
        t.schedule(task,new Date(),1000);  //在当前时间每隔一秒运行一次
        //t.schedule(task,2000,2000); //间隔两秒之后，在执行，后面每2秒在执行一次
    }
}
