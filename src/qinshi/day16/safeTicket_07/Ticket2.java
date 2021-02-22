package qinshi.day16.safeTicket_07;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Ticket2
 * @Date 2021/1/21 16:42
 */
public class Ticket2 extends Thread{
    //总票数，每个窗口共享一个数据
    //int num=10; //每个窗口都会卖10张票
    static int num=10; //被static修饰的成员，会被当前这个类的所有对象共享！！！

    @Override
    public void run() {
        //卖票
        while (num>0){
            maiPiao(); //普通方法调用静态方法，直接写方法名，不用类名.方法名;普通方法调用非静态方法，也是直接写方法名
        }

    }

    /*
    采用同步方法的方式
        1、就是在需要被同步的方法上面加关键字  synchronized
		2、加的位置 ：在返回值类型的前面
		4、如果是一个非static的方法，那么同步监听对象就是this;
		5、如果是static修饰的方法，那么同步监听对象就是当前方法所在的类的字节码文件
     */
    public static synchronized void maiPiao(){  //方法需要用static修饰，因为这里创建了多个对象
        if(num>0){             //获取线程名字
            System.out.println(Thread.currentThread().getName()+"窗口，卖出了第"+num+"张票");
            //卖出去以后才减少
            num--;
        }
    }

}
