package qinshi.day4;

import java.util.Scanner;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task5
 * @Date 2021/1/4 9:29
 */
public class Task5 {
    void ifYear(int x){
        if(((x%4)==0&&(x%100)!=0) || (x%400)==0){
            System.out.println("闰年");
        }
        else {
            System.out.println("平年");
        }
    }
    public static void main(String[] args) {
        Task5 task5= new Task5();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<=3;i++){
            System.out.println("请输入一个年份：");
            task5.ifYear(scanner.nextInt());
            System.out.println();
        }
    }
}
