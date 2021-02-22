package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task52
 * @Date 2021/2/19 23:04
 */
/*设计一个方法，获取数组中最小的元素的下标*/
public class Task52 {
    @Test
    public void test() throws Exception{
        System.out.println(getMinArrayIndex(new int[]{4,3,5,2,6,1,9}));
    }

    int getMinArrayIndex(int[] arr){
        int minIndex=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                minIndex=i+1;
            }
        }
        return minIndex;
    }
}
