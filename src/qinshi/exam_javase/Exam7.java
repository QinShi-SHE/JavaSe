package qinshi.exam_javase;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam7
 * @Date 2021/2/3 10:01
 */
public class Exam7 {
    //设计一个方法，可以合并任意相同类型的两个数组arr1,arr2,请将合并后的数组升序排序后返回。
    @Test
    public void test() throws Exception{
        Integer[] t1 = {1,2,4,34,6};
        Integer[] t2 = {1,67,4,2344,69,0};
        Integer[] array = mergeArray(t1, t2);
        System.out.println(Arrays.toString(array));
    }

    public static<T> T[] mergeArray(T[] t1,T[] t2) {
        if(t1==null || t2==null){
            throw new NullPointerException("错误！数组为null!");
        }

        //使用Arrays数组扩容方法copyOf，将t1直接扩容，并且复制了t1中的元素到新数组
        T[] newArr = Arrays.copyOf(t1, t1.length+t2.length);

        //将数组t2中元素复制到新数组,
        System.arraycopy(t2,0,newArr,t1.length,t2.length);

        //排序数组的元素
        Arrays.sort(newArr);
        return newArr;
    }
}
