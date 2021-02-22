package qinshi.day16.locksafeticket_08;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Ticket2
 * @Date 2021/1/21 18:26
 */
/*
        实现Runnable接口来解决线程安全问题
 */
public class Ticket2 implements Runnable{
    //总票数
    int num=10;

    //加锁方式 ,这里不需要用static修饰，因为只创建了一个对象
    ReentrantLock lock=new ReentrantLock(); //定义一把锁

    @Override
    public void run() {
        while (num>0){
            try {
                //加锁
                lock.lock();
                if(num>0){              //获取线程的名字
                    System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
                    //卖出去之后减一张票
                    num--;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //释放锁
                lock.unlock();
            }
        }
    }
}
