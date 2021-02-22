package qinshi.day16.thead_03;

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
                1.自定义类继承Thread类
                2.重写父类run方法
                3.在测试类中创建线程类的对象
                4.通过start方法开启线程,开启线程默认调用run方法

         直接调用run和start的区别
         1.直接调用run方法，不会开启线程
         2.只有调用start，才有启动一个独立的线程

 */
public class TreadTest {
    public static void main(String[] args) {
        //new PlayGame().run();  //只是调用普通方法，没有开启线程
        //new PlayMusic().run();


        PlayGame pg1=new PlayGame();
        PlayMusic pg2=new PlayMusic();

        //停止线程
        //pg1.stop();  //还没开始就停止了，后面就不会执行

        //调用线程方法
        pg1.start();  //交叉执行和顺序没有关系
        pg2.start();
    }
}
