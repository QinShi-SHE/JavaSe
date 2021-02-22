package qinshi.day16.thead_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MyThread
 * @Date 2021/1/21 14:34
 */
public class MyThread extends Thread{
    private int ticket = 5;
    public void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}

 class ThreadDemo{
    public static void main(String[] args){
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        /*
        从结果中可以看出，每个线程单独卖了 5 张票，即独立地完成了买票的任务，
        但实际应用中，比如火车站售票，需要多个线程去共同完成任务，在本例中，即多个线程共同买 5 张票。
         */
    }
}