package qinshi.day16.method_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ThreadMethod
 * @Date 2021/1/21 15:17
 */
/*
public final void setName(String name)
改变 Thread 对象的名字。也有一个 getName()方法来检索名字。

public final void setPriority(int priority)
设置 Thread 对象的优先级。可能的值在 1 到 10 之间。

public static void sleep(long millisec)
使当前运行的线程阻塞至少指定的毫秒数。

public static Thread currentThread()
返回对当前运行的线程的引用，也就是调用这个方法的线程。

线程优先级越高，分配的时间片段越多，但不一定先执行

对象名也可以调用static修饰的方法，但最终还是通过类名.方法名的方式,不建议
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread();
        //打印结果：Thread[线程的名字，优先级，线程组]
        System.out.println(t);

        //设置线程名字
        t.setName("线程1");
        //设置优先级
        t.setPriority(10);
        //休眠线程
        t.sleep(2000); //2秒
        System.out.println(t);

        Thread t2=Thread.currentThread();
        Thread t3=t2.currentThread(); //对象名也可以调用static修饰的方法，但最终还是通过类名.方法名的方式
        System.out.println(t2);
    }
}
