package qinshi.day16.runable_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PlayGame
 * @Date 2021/1/21 14:16
 */
public class PlayGame implements Runnable{
    /*
         创建线程步骤
                1.自定义类实现runnable接口
                2.重写父类run方法
                3.创建实现类的对象
                4.创建Thread类对象，将实现类对象作为参数传入
                5.由Thread对象调用start方法
     */

    @Override
    public void run() {
        for(int i=1;i<16;i++){
            System.out.println("玩游戏"+ i);
        }

    }

//    public static void main(String[] args) {
//        new PlayGame().run();
//    }
}
