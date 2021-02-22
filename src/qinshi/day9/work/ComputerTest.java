package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ComputerTest
 * @Date 2021/1/11 16:57
 */
public class ComputerTest {
    public static void main(String[] args) {
        /*
            测试类(main): 初始化2台电脑，分别显示两台电脑的信息，然后一台用来玩游戏，一台用来办公
         */

        Computer com1=new Computer(111111111,19980,"外星人","红色");
        Computer com2=new Computer(2222222,20980,"玩家国度","白色");

        System.out.println(com1.viewXX()+com1.playGame());
        System.out.println(com2.viewXX()+com2.office());
    }
}
