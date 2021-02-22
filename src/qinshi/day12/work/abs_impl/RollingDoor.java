package qinshi.day12.work.abs_impl;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RollingDoor
 * @Date 2021/1/15 13:51
 */
public class RollingDoor extends Door{
    @Override
    void openDoor() {
        System.out.println("卷帘门开门");
    }

    @Override
    void closeDoor() {
        System.out.println("卷帘门关门");
    }
}
