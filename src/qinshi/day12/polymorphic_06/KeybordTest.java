package qinshi.day12.polymorphic_06;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName KeybordTest
 * @Date 2021/1/15 15:51
 */
public class KeybordTest {
    public static void main(String[] args) {
        //接口支持多态
        Usb kb=new Keybord();
        kb.an();
    }
}
