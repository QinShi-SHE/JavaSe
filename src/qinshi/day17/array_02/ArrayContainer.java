package qinshi.day17.array_02;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ArrayContainer
 * @Date 2021/1/22 10:21
 */
/*
以数组为底层的实现来创建一个自定义的容器
自定义的容器中要实现任意个数，任意类型
    1.先创建一个数组
    2.放数据的时候要去判断这个容量是否已经使用完了
    3.一旦定义的长度满了，创建一个新数组，长度就为原数组的两倍
    4.将原数组中的数据复制到新数组中
 */
public class ArrayContainer {
    public static void main(String[] args) {
        //创建一个数组
        int[] i =new int[5];
        i[0]=1;
        i[1]=2;
        i[2]=3;
        i[3]=4;
        i[4]=5;

        int[] j=new int[i.length*2];  //创建一个新的数组
        j[5]=6;

        //把原数组复制给新数组
        System.arraycopy(i,0,j,0,i.length);
        System.out.println(Arrays.toString(j));
    }
}
