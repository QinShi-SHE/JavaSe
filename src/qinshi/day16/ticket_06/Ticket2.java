package qinshi.day16.ticket_06;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Ticket2
 * @Date 2021/1/21 16:15
 */
public class Ticket2 implements Runnable {
    //总票数，每个窗口共享一个数据
    int num=10; //每个窗口都会卖10张票 //这里不用加static修饰，因为测试类只创建了一个对象
    //static int num=10; //被static修饰的成员，会被当前这个类的所有对象共享！！！

    @Override
    public void run() {
        while (num>0){
            if(num>0){             //获取线程名字
                System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
                //卖出去以后才减少
                num--;
            }

        }
    }
}
