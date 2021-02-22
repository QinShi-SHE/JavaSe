package qinshi.day16.ticket_06;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TicketTest2
 * @Date 2021/1/21 16:16
 */
public class TicketTest2 {
    public static void main(String[] args) {
//        Ticket2 t1=new Ticket2();
//        Ticket2 t2=new Ticket2();
//        Ticket2 t3=new Ticket2();
//
//        new Thread(t1,"三号").start();
//        new Thread(t2,"四号").start();
//        new Thread(t3,"五号").start();

        Ticket2 t=new Ticket2();  //只需要创建一个对象

        new Thread(t,"三号").start();
        new Thread(t,"四号").start();
        new Thread(t,"五号").start();
    }
}
