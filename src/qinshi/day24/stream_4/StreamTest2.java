package qinshi.day24.stream_4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StreamTest
 * @Date 2021/2/2 15:23
 */
/*
1. void forEach(Consumer<? super T> action) 对此流的每个元素执行操作。
			      返回值是void，只能放在流的最后一位
					public interface Consumer<T>是一个函数式接口
					使用方式，lambda，表示接受一个参数，并且处理完后没有返回值。
				  		void accept(T t) 对给定的参数执行此操作。
 */
public class StreamTest2 {
    @Test
    public void test() throws Exception{
        //创建一个集合存放数据
        ArrayList list=new ArrayList();
        list.add("有一首歌");
        Collections.addAll(list,1,"她们唱的就是爱情哎",'a',false);
        //获取到流
        Stream s=list.stream();
        s.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

        /*
         *   使用lambda表达式表示
         *   引用的方法：void println(Object x)
         * 	接口中的方法:void accept(T t)
         * 	满足：类名::实例方法名
         *
         * System.out 返回的是  PrintStream
         * System.out是PrintStream类型的一个对象,是一个整体
         *
         * System.out::println 输出语句
         */
        //获取到流
        Stream s2=list.stream();
        s2.forEach(o -> System.out.println(o));

        //获取到流
        Stream s3=list.stream();
        s3.forEach(System.out::println);

        //最简洁的
        list.stream().forEach(System.out::println);
    }
}
