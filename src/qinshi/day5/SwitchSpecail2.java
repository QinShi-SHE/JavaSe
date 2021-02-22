package qinshi.day5;

import java.util.Scanner;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SwtichSpecail2
 * @Date 2021/1/5 11:02
 */
public class SwitchSpecail2 {
    public static void main(String[] args) {
        //月份可以省略一些break
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            default:
                System.out.println("请输入正确的月份！！！");
                break;
        }
    }
}
