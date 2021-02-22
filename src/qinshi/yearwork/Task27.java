package qinshi.yearwork;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task27
 * @Date 2021/2/19 16:32
 */
/*将int[] arr = ｛22，11，44，8，2，80，77｝ 复制到新数组 newArr,只复制 从第2个元素到第5个元素并且降序排列	*/
public class Task27 {
    @Test
    public void test() throws Exception{
        int[] arr = {22,11,44,8,2,80,77};
        int[] newArr=new int[4];
        System.arraycopy(arr,1,newArr,0,4); //从源数组，下标为1的开始，复制到目标数组，从下标为0开始，复制长度为4个；
        //将数组进行升序排列
        Arrays.sort(newArr);
        StringBuffer arr2=new StringBuffer();
        //System.arraycopy(newArr,0,arr2,0,4);
        for (int i:newArr){  //遍历数组
            arr2.append(i+" "); //添加到StringBuffer
        }
        System.out.println(arr2.reverse()); //调用字符串反转
    }
}
