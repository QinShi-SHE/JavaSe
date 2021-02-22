package qinshi.day5;

import java.util.Scanner;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/4 16:19
 */
public class Task2 {
    void getSum(int n){
        int sum=0,x=1;
        for(int i=1;i<=n;i++){
            x*=i;
            sum+=x;
            System.out.println(i+"！="+x);
        }
       System.out.println(n+"阶乘之和为："+sum);
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n!的阶乘：");
        task2.getSum(scanner.nextInt());
    }
}
