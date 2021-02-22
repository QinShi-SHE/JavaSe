package qinshi.day16.safeTicket_07;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Ticket
 * @Date 2021/1/21 15:45
 */
public class Ticket extends Thread{
    //总票数，每个窗口共享一个数据
    //int num=10; //每个窗口都会卖10张票
    static int num=10; //被static修饰的成员，会被当前这个类的所有对象共享！！！

    //享元模式
    Integer i=1;

    //常量池
    String s="a";

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
            synchronized (i){  //Tickt.clss 或者 i 或者 s
                if(num>0){             //获取线程名字
                    System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
                    //卖出去以后才减少
                    num--;
                }
            }


        }
    }
}
