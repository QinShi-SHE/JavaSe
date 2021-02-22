package qinshi.day4;

import java.util.Scanner;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/3 17:54
 */
public class Task2 {
    public void ifJiOu(int i){
        if(i%2==0){
            System.out.println("--------------------");
            System.out.println("您输入的这个数："+i+" 是偶数！");
        }else{
            System.out.println("--------------------");
            System.out.println("您输入的这个数："+i+" 是奇数！");
        }
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        System.out.println("--------------------");
        System.out.println("请输入一个整数：");
        System.out.println("--------------------");
        Scanner sc=new Scanner(System.in);
        task2.ifJiOu(sc.nextInt());
        System.out.println("--------------------");
    }
}
