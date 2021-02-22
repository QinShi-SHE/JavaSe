package qinshi.day16.safeTicket_07;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName SafeTicket3
 * @Date 2021/1/21 18:50
 */
public class SafeTicket3 {
    public static void main(String[] args) {
        Ticket3 t=new Ticket3();

        new Thread(t,"三号").start();
        new Thread(t,"四号").start();
        new Thread(t,"五号").start();
    }
}
