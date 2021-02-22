package qinshi.exam_javase;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam1
 * @Date 2021/2/2 18:42
 */
public class Exam1 {
    ////1、定义一个方法：返回数组中最小的那个数
    int returnMin(){
        int[] a={1,5,3,7,9,-1};
        int min=a[0];
        for(int i: a){
            if(min>i)
                min=i;
        }
        return min;
    }
    @Test
    public void test() throws Exception{
        System.out.println(returnMin());
    }
}
