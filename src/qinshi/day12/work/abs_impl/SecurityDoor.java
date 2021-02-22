package qinshi.day12.work.abs_impl;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SecurityDoor
 * @Date 2021/1/15 13:51
 */
public class SecurityDoor extends Door{
    @Override
    void openDoor() {
        System.out.println("防盗门开门");
    }

    @Override
    void closeDoor() {
        System.out.println("防盗门关门");
    }
}
