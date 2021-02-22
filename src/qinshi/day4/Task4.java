package qinshi.day4;

import java.util.Scanner;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task4
 * @Date 2021/1/3 18:57
 */
public class Task4 {
    //方法一
    void sumFour(int i){
        int a,b,c,d;
        a=i%10;
        b=(i/10)%10;
        c=(i/100)%10;
        d=(i/1000)%10;
        System.out.println("这个数的千位数是："+d+
                            "\n\t  百位数是："+c+
                            "\n\t  十位数是："+b+
                            "\n\t  个位数是："+a);
        System.out.println("各位数之和为："+a+"+"+b+"+"+c+"+"+d+"="+(a+b+c+d));
    }
    public static void main(String[] args) {
        Task4 task4=new Task4();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        //task4.sumFour(scanner.nextInt());

        //方法二，可以求任何位数的各位数之和！
        int sum=0,a;
        a=scanner.nextInt();
        while (a>0){  //不知道循环次数就用while
            sum+=a%10;
            a/=10;
        }
        System.out.println("各位数之和为："+sum);
//        System.out.println((3478/1000)%10);
//        System.out.println((3478/100)%10);
//        System.out.println((3478/10)%10);
//        System.out.println(3478%10);
    }
}
