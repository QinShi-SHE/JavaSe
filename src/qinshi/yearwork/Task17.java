package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task17
 * @Date 2021/2/19 14:39
 */
/*编写程序将String类型字符串”test” 变为 “tset”*/
public class Task17 {
    @Test
    public void test() throws Exception{
        String str="test";
        //因为String 没有反转的方法只能通过StringBuffer来实现相应的功能
        StringBuffer stringBuffer=new StringBuffer(str);
        //调用reverse()方法实现字符的反转
        str=stringBuffer.reverse().toString();  //将StringBuffer类型转换为String类型
        System.out.println(str);
    }
}
