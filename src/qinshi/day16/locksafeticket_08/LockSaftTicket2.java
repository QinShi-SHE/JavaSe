package qinshi.day16.locksafeticket_08;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName LockSafeTicket2
 * @Date 2021/1/21 18:26
 */
public class LockSaftTicket2 {
    public static void main(String[] args) {
        Ticket2 t=new Ticket2();

        new Thread(t,"三号").start();
        new Thread(t,"四号").start();
        new Thread(t,"五号").start();
    }
}
