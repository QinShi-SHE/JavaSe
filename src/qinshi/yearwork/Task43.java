package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task43
 * @Date 2021/2/19 19:23
 */
/*请用递归打印1-100*/
public class Task43 {
    @Test
    public void test() throws Exception{
        printNum(1);
    }

    void printNum(int num){
        System.out.println(num);
        num++;
        if(num<=100)
            printNum(num);
    }
}
