package qinshi.day16.safeTicket_07;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName SafeTicket4
 * @Date 2021/1/21 18:50
 */
public class SafeTicket4 {
    public static void main(String[] args) {
        Ticket4 t=new Ticket4();

        new Thread(t,"三号").start();
        new Thread(t,"四号").start();
        new Thread(t,"五号").start();
    }
}
