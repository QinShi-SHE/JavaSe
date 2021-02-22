package qinshi.day24.interface_1;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName UsbTest
 * @Date 2021/2/2 9:35
 */
public class UsbTest {
    @Test
    public void test() {
        UsbImp u=new UsbImp();
        u.get();
    }

    @Test
    public void test2(){
        Usb us=new Usb() {  //可以用对象接收
            @Override
            public void get() {
                System.out.println("匿名内部类调用");
            }
        };
        us.get();
    }
    public static void main(String[] args) {
        UsbImp u=new UsbImp();
        u.get();

        new Usb() {
            @Override
            public void get() {
                System.out.println("匿名内部类调用");
            }
        }.get();  //后面要.方法
    }
}
