package qinshi.day16.ticket_06;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TicketTest
 * @Date 2021/1/21 15:49
 */
public class TicketTest {
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
