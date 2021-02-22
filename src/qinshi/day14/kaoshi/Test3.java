package qinshi.day14.kaoshi;

import java.util.Scanner;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test3
 * @Date 2021/1/18 19:23
 */
public class Test3 {
    public static void main(String[] args) {
        /*
        3，验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是
            偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进
            行下去，最终必然得到 1。
         */
        int a=999;
        while (true){
            if(a%2!=0){
                a=a*3+1;
            }
            if(a%2==0){
                a/=2;
            }
            if(a==1){
                break;
            }
        }
        System.out.println(a);
    }
}
