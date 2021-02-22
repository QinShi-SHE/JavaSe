package qinshi.day16.locksafeticket_08;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Ticket
 * @Date 2021/1/21 16:50
 */
public class Ticket extends Thread{
    //总票数，每个窗口共享一个数据
    //int num=10; //每个窗口都会卖10张票
    static int num=10; //被static修饰的成员，会被当前这个类的所有对象共享！！！

    //实现类对象需要被static共享
    static ReentrantLock lock=new ReentrantLock(); //加static ，把锁设为共享锁

    @Override
    public void run() {
        while (num>0){
            try{ //加try catch完整写法
                //获取锁
                lock.lock();
                if(num>0){             //获取线程名字
                    System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
                    //卖出去以后才减少
                    num--;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //释放锁
                lock.unlock();  //不管代码是否发生异常，都需要将锁释放开
            }
        }
    }
}
