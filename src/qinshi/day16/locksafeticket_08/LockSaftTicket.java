package qinshi.day16.locksafeticket_08;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LockSaftTicket
 * @Date 2021/1/21 16:50
 */
/*
采用加锁的方式去解决线程安全问题
ReentrantLock 是Lock接口的实现类
 */
public class LockSaftTicket {
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
