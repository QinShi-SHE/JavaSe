package qinshi.day12.work.abs_impl;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DoorTest
 * @Date 2021/1/15 14:01
 */
public class Test {
    public static void main(String[] args) {
        RollingDoor r=new RollingDoor();
        SecurityDoor s=new SecurityDoor();
        AiDoor a=new AiDoor();

        r.openDoor();
        r.closeDoor();

        s.openDoor();
        s.closeDoor();

        a.faceAi();
    }
}
