package qinshi.day24.stream_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StreamTestMap
 * @Date 2021/2/2 16:16
 */
/*
 <R> Stream<R> map(Function<? super T,? extends R> mapper)
		 		map方法，取出每一个元素操作（运算....）
				Function接口中方法: R apply(T t)
 */
@SuppressWarnings("all")  //消除警告
public class StreamTestMap {
    @Test
    public void test() throws Exception{
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Stream s=list.stream();
        s.map(new Function<Integer,Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i*2;
            }
        }).forEach(System.out::println);

        // lambda简化
        Stream s2=list.stream();
        s2.map(i ->(Integer)i*2).forEach(System.out::println);

        System.out.println();
        // long count()获取当前元素个数
        Stream s3=list.stream();
        System.out.println(s3.count());

    }
}
