package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BookTest
 * @Date 2021/1/17 13:59
 */
public class BookTest {
    public static void main(String[] args) {
        Book b1=new Book('红',112);
        Book b2=new Book();
        b2.setColor('绿');
        b2.setCpu(111);
        System.out.println(b1);
        System.out.println(b2);
    }
}
