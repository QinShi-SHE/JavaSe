package qinshi.day23.interface_2;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName InterfaceTest
 * @Date 2021/1/31 10:25
 */
/*
接口只有两种  因为接口不能创建对象
     1.完全限定名
    2.类名.class
 */
public class InterfaceTest {
    @Test
    public void test() throws ClassNotFoundException {
        Class name=Class.forName("qinshi.day23.interface_2.Usb");
        Class name2=Usb.class;
    }
}
