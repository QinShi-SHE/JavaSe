package qinshi.exam_javase;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam2
 * @Date 2021/2/2 18:54
 */
public class Exam2 {
    /*
       2，验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是
           偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进
           行下去，最终必然得到 1。
     */
    @Test
    public void test() throws Exception{
        int a=777;
        while (true){
            if(a%2!=0)
                a=a*3+1;
            if(a%2==0)
                a/=2;
            if(a==1)
                break;
        }
        System.out.println(a);
    }
}
