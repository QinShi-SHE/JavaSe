package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task54
 * @Date 2021/2/19 23:47
 */
/*统计找出一万以内，一共有多少质数，并且打印输出 质数(质数又称素数)概念: 只能被1和自己整除的数*/
public class Task54 {
    @Test
    public void test() throws Exception{
        int count=0;
        for (int i = 2; i <=10000 ; i++) {
            if(isPrime(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("一万以内的质数个数为："+count+"个");
    }

    //判断一个数是否为质数
    boolean isPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {  //一个数要被整除，这个被除的数至少要小于它的开方！！！
            if(num%i==0)
                return false;
        }
        return true;
    }
}
