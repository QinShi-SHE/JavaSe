package qinshi.day24.stream_4;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StreamTestMap2
 * @Date 2021/2/2 16:45
 */
public class StreamTestMap2 {
    @Test
    public void test() throws Exception{

        /*
		 * 聚合操作
		 * 将Stream流中的元素进行聚合操作
			  	<R,A> R collect(Collector<? super T,A,R> collector)

			  	获取一个Collector实现类对象方式：通过Collectors工具类中的方法
			  		将Stream流转换为集合对象
			  			static <T> Collector<T,?,List<T>> toList() 将流中的元素放到一个List集合
					将Stream流中元素按照字符串 拼接
		 				static Collector<CharSequence,?,String> joining(CharSequence delimiter)
		 		例如：
		  		List<T> list = collect(Collectors.toList());将流中 的元素再转换为集合
		 */
        //asList()把数组转换为集合
        List<Integer> list = Arrays.asList(5,2,1,346,234,5);
		//获取串行流
		Stream<Integer> stream = list.stream();
		//调用collect方法 ，将Stream流对象转换为List集合  collect(Collectors.toList());将流中 的元素再转换为集合
		List<Integer> list4 = stream.collect(Collectors.toList());//Collectors.toList()方法返回值类型是Collector
		System.out.println(list4);

        List<String> list2 = Arrays.asList("a","b","c");
        Stream<String> stream2 = list2.stream();
        //拼接
        String str = stream2.collect(Collectors.joining("---)=====>>>>"));  //执行完后流已经关闭，不能再用
        System.out.println(str);
        //打印报错 因为流已经关闭
        //stream2.forEach(System.out::println);

        //再用流需要新建流
        Stream<String> stream3 = list2.stream();
        stream3.forEach(System.out::println);
    }
}
