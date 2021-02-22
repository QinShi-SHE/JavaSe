package qinshi.day16.safeTicket_07;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Ticekt4
 * @Date 2021/1/21 18:44
 */
/*
        实现Runnable接口来解决线程安全问题
 */
public class Ticket4 implements Runnable{
    int num=10; //总票数，只创建了一个对象,不需要用static修饰

    @Override
    public void run() {
        while (num>0){
           maiPiao();
        }
    }

    /*
   采用同步方法的方式
       1、就是在需要被同步的方法上面加关键字  synchronized
       2、加的位置 ：在返回值类型的前面
       4、如果是一个非static的方法，那么同步监听对象就是this;
       5、如果是static修饰的方法，那么同步监听对象就是当前方法所在的类的字节码文件
    */
    public synchronized void maiPiao(){  //这里不用static修饰，因为只创建了一个对象
        if(num>0){
            System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
            //卖出去以后才减少
            num--;
        }
    }
}
