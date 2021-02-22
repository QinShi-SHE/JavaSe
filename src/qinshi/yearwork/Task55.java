package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task56
 * @Date 2021/2/20 0:06
 */
/*计算  1！ + 2！ + 。。。12！ 1到12的阶乘和   单层for循环就能搞定*/
public class Task55 {
    @Test
    public void test() throws Exception{
      getPower(12);
    }

    void getPower(int num){
        int sum=0,ji=1;
        for (int i = 1; i <=num ; i++) {
            ji*=i;
            sum+=ji;
        }
        System.out.println(sum);
    }
}
