package qinshi.day16.thead_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PlayGame
 * @Date 2021/1/21 14:16
 */
public class PlayGame extends Thread{
    /*
         创建线程步骤
                1.自定义类继承Thread类
                2.重写父类run方法
                3.在测试类中创建线程类的对象
                4.通过start方法开启线程,开启线程默认调用run方法
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
