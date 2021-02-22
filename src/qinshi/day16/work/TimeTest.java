package qinshi.day16.work;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName TimeTest
 * @Date 2021/1/21 19:31
 */
public class TimeTest {
    public static void main(String[] args) throws InterruptedException {
        Time t=new Time();
        Thread thread=new Thread(t);
        while (true){
            //thread.start();
            thread.run();
            thread.sleep(1000);
        }
    }
}
