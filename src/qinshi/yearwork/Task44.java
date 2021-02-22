package qinshi.yearwork;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task44
 * @Date 2021/2/19 20:54
 */
/*
 * 有数组a[n]，用java代码将数组元素顺序颠倒
 */
public class Task44 {
    @Test
    public void test() throws Exception{

        int a[]={11,8,2,24,90,23};

        //首先可以用集合的方法把数组元素颠倒
        List<Integer> list=new ArrayList<Integer>();
        for(Integer i:a) {
            list.add(i);
        }
        Collections.reverse(list);  //调用Collections工具类中的反转方法
        for(Integer i:list) {
            System.out.print(i+" ");
        }

        //也可以用循环首尾互换的方法搞定
        for(int i=0;i<a.length>>1;i++) {
            int temp;
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        System.out.println();
        for(int i:a) {
            System.out.print(i+" ");
        }
    }
}
