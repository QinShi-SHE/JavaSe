package qinshi.day4;

import java.util.Scanner;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task7
 * @Date 2021/1/4 10:06
 * 机票价格按照淡季旺季、头等舱和经济舱收费、定义机票原价、月份和头等舱或经济舱，
 * 其中旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
 * 最终输出机票价格(使用if嵌套，头等舱定义为1，经济舱定义为2)
 */
public class Task7 {
    static int menoy=1000;
    void printMenoy(int month,int id){
        if(month==5 | month==6 | month==7 | month==8 | month==9 | month==10){
            switch (id){
                case 1:
                    menoy*=0.9;
                    System.out.println("最终机票价格："+menoy+"$");
                    break;
                case 2:
                    menoy*=0.85;
                    System.out.println("最终机票价格："+menoy+"$");
                    break;
                //default:System.out.println("非法输入");
            }
        }
        if(month==11 | month==12 | month==1 | month==2 | month==3 | month==4){
            switch (id){
                case 1:menoy*=0.7;System.out.println("最终机票价格："+menoy+"$");break;
                case 2:menoy*=0.65;System.out.println("最终机票价格："+menoy+"$");break;
                //default:System.out.println("非法输入");
            }
        }
    }
    public static void main(String[] args) {
        int month,id;
        Task7 task7 = new Task7();
        Scanner scanner = new Scanner(System.in);
        System.out.println("当前机票价格为："+menoy+"$");
        System.out.println("请输入月份：");
        month=scanner.nextInt();
        if(month==5 | month==6 | month==7 | month==8 | month==9 | month==10 | month==11 | month==12 | month==1 | month==2 | month==3 | month==4){
            System.out.println("请选择："+
                    "\n\t1.头等舱"+
                    "\n\t2.经济舱");
            id=scanner.nextInt();
            if(id!=1 & id!=2){
                System.out.println("非法选择！！！");
            }
            task7.printMenoy(month,id);
        }else {
            System.out.println("非法月份！！！");
        }
    }
}
