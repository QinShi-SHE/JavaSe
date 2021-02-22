package qinshi.day17.timer_01;

import java.util.TimerTask;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MyTimerTask
 * @Date 2021/1/22 9:41
 */
public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("定时任务");
    }
}
