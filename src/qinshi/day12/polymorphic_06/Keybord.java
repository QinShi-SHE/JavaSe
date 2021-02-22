package qinshi.day12.polymorphic_06;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Keybord
 * @Date 2021/1/15 15:51
 */
public class Keybord implements Usb{

    @Override
    public void an() {
        System.out.println("键盘按下");
    }
}
