package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task24
 * @Date 2021/2/19 15:41
 */
/*一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）递归*/
public class Task24 {
    int count=0;
    double width=0.00008; //0.08mm=0.00008m;
    @Test
    public void test() throws Exception{
        System.out.println("一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）?");
        System.out.println("答：需要对折"+getCount()+"次。");
    }

    int getCount(){
        count++;
        width=width*2;
        if(width<8848.13){
            getCount();
        }
        return count;
    }
}
