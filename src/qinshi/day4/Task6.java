package qinshi.day4;

import java.util.Scanner;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task6
 * @Date 2021/1/4 9:47
 * 商场根据会员积分打折，2000分以内打9折，4000分以内打8折,
 * 8000分以内打7.5折，8000分以上打7折，使用if-else-if结构，定义购物金额和积分，计算出应缴金额
 */
public class Task6 {
    void getMenoy(double menoy,int source){
        if(source>0 && source<=2000){
            menoy*=0.9;
        }
        else if(source>2000 && source<=4000){
            menoy*=0.8;
        }
        else if(source>4000 && source<=8000){
            menoy*=0.75;
        }
        else if(source>8000){
            menoy*=0.7;
        }
        System.out.println("折后价："+menoy);
    }
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的购物金额：");
        double menoy=scanner.nextInt();
        System.out.println("请输入您的会员积分：");
        int source=scanner.nextInt();
        task6.getMenoy(menoy,source);
    }
}
