package qinshi.day16.runable_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PlayMusic
 * @Date 2021/1/21 14:20
 */
public class PlayMusic implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<20;i++){
            System.out.println("播放音乐"+i);
        }
    }
}
