package qinshi.day16.safeTicket_07;


/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SafeTicket
 * @Date 2021/1/21 16:22
 */
/*
线程安全问题：同一个类对象共享一个数据时，造成数据不一致的情况
解决线程安全问题
    1.同步   synchronized
        同步代码块
        同步方法
   2.枷锁
 */
public class SafeTicket {
    public static void main(String[] args) {
        Ticket t1=new Ticket();
        Ticket t2=new Ticket();
        Ticket t3=new Ticket();

        t1.setName("一号");
        t2.setName("二号");
        t3.setName("三号");

        t1.start();
        t2.start();
        t3.start();
    }
}
