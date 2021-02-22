package qinshi.yearwork;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task58
 * @Date 2021/2/20 0:28
 */
/*设计一个方法，统计一个字符在字符数组中出现的次数*/
public class Task58 {
    @Test
    public void test() throws Exception{
        countChar('我',new char[]{'我','A','B','琴','a',97,117,'我'});
    }

    void countChar(char c,char[] charArray){
        int count=0;
        for(char i:charArray){
            if(c==i)
               count++;
        }
        System.out.println("这个字符"+c+"在"+ Arrays.toString(charArray)+"中出现的次数是："+count+"次");
    }
}
