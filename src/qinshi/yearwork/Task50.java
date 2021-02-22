package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task50
 * @Date 2021/2/19 22:58
 */
/*打印 1-100 之间的数，如果这个数，是3或者5的倍数，就忽略掉*/
public class Task50 {
    @Test
    public void test() throws Exception{
        for (int i = 1; i <101 ; i++) {
            if(i%3!=0 && i%5!=0){
                System.out.println(i);
            }
        }
    }
}
