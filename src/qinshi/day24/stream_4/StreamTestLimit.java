package qinshi.day24.stream_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StreamTestLimit
 * @Date 2021/2/2 16:31
 */
/*
 Stream<T> limit(long maxSize) 获取一个元素个数是maxSize个的Stream对象

Stream<T> sorted() 元素必须是实现Comparable接口
					返回根据自然顺序排序的流，。

Stream<T> distinct() 将流中元素去重,不保证顺序
 */
public class StreamTestLimit {
    @Test
    public void test() throws Exception{
        ArrayList list=new ArrayList();
        Collections.addAll(list,1,5,8,666,56,1);

        //获取4个数，并排序
        list.stream().limit(4).sorted().forEach(System.out::println);

        System.out.println();
        //获取6个数，排序、去重
        list.stream().limit(6).distinct().sorted().forEach(System.out::println);

        System.out.println();
        //随机数
        Random random=new Random();
        //在随机数中获取3个数  排序
        random.ints().limit(3).sorted().forEach(System.out::println);
    }
}
