package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task23
 * @Date 2021/2/19 15:30
 */
/*本金10000元存入银行，年利率是千分之三，每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少*/
public class Task23 {
    @Test
    public void test() throws Exception{
        System.out.println(countMoney(10000,5));
    }

    double countMoney(double money,int year){
        for (int i = 1; i <= year; i++) {
            money=money*(1+0.003);
        }
        return money;
    }
}
