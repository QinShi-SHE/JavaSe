package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/2 20:43
 */
public class Task2 {
    public static void main(String[] args){
        int a=4,b=7,c=10,d;
        System.out.println("交换前：\n"+"a="+a+"\nb="+b+"\nc="+c);
        d=a;
        a=c;
        c=b;
        b=d;
        System.out.println("交换后：\n"+"a="+a+"\nb="+b+"\nc="+c);
    }
}
