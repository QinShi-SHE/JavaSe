package qinshi.day24.stream_4;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StreamTestFilter
 * @Date 2021/2/2 18:04
 */
public class StreamTestFilter {
    @Test
    public void test() throws Exception{
        Stream<String> stream = Arrays.asList("1","","16","","12").stream();
		stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
			    //判断不为空的方式1
//			    if(t==null||t.equals("")){
//			        return false;
//                }else {
//			        return true;
//                }

				//返回不为空的数据
				return !t.isEmpty();  //判断不为空的方式2
			}
		}).forEach(System.out::println);

        Stream<String> stream2 = Arrays.asList("1","","16","","12").stream();
        //lambda表达式优化
        stream.filter(t -> !t.isEmpty()).forEach(System.out::println);
    }
}
