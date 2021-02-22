package qinshi.day16.safeTicket_07;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SafeTicket2
 * @Date 2021/1/21 16:48
 */
public class SafeTicket2 {
    public static void main(String[] args) {
        Ticket2 t1=new Ticket2();
        Ticket2 t2=new Ticket2();
        Ticket2 t3=new Ticket2();

        t1.setName("一号");
        t2.setName("二号");
        t3.setName("三号");

        t1.start();
        t2.start();
        t3.start();
    }
}
