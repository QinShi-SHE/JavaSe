package qinshi.day24.stream_4;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StreamTest
 * @Date 2021/2/2 15:23
 */
public class StreamTest {
    @Test
    public void test() throws Exception{
        StringBuffer sb=new StringBuffer().append("abc").insert(1,"123").delete(0,1).append("ccc");
        System.out.println(sb);
    }
}
