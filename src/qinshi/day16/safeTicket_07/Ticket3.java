package qinshi.day16.safeTicket_07;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Ticket3
 * @Date 2021/1/21 18:44
 */
/*
        实现Runnable接口来解决线程安全问题
 */
public class Ticket3 implements Runnable{
    int num=10; //总票数，只创建了一个对象,不需要用static修饰

    @Override
    public void run() {
        while (num>0){
            /*采用同步代码块的方式来解决线程安全问题
                ()中时放的同步监听对象
                监听对象必须满足唯一性
                可以监听的有：
                        1、当前类的字节码文件 类名.class  建议
                        2.享元模式 Integer
                        3.常量池  String
                 实现接口能使用this,继承不能用this不满足唯一性
             */
            synchronized (Ticket3.class){
                if(num>0){
                    System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
                    //卖出去以后才减少
                    num--;
                }
            }
        }
    }
}
