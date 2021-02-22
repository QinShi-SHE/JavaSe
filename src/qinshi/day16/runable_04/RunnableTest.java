package qinshi.day16.runable_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TreadTest
 * @Date 2021/1/21 14:07
 */
/*
Java 中实现多线程有两种方法：
        继承 Thread 类、
        实现 Runnable 接口，
程序开发中只要是多线程，肯定永远以实现 Runnable 接口为主，因为实现 Runnable 接口相比继承 Thread 类有如下优势：
        可以避免由于 Java 的单继承特性而带来的局限；
        增强程序的健壮性，代码能够被多个线程共享，代码与数据是独立的；
        适合多个相同程序代码的线程区处理同一资源的情况。

         创建线程步骤
                1.自定义类实现runnable接口
                2.重写父类run方法
                3.创建实现类的对象
                4.创建Thread类对象，将实现类对象作为参数传入
                5.由Thread对象调用start方法

         直接调用run和start的区别
         1.直接调用run方法，不会开启线程
         2.只有调用start，才有启动一个独立的线程

 */
public class RunnableTest {
    public static void main(String[] args) {
        //new PlayGame().run();  //只是调用普通方法，没有开启线程
        //new PlayMusic().run();


        Runnable pg1=new PlayGame();  //多态
        PlayMusic pg2=new PlayMusic();

        //调用线程方法
        new Thread(pg1).start();
        new Thread(pg2).start();
    }
}
