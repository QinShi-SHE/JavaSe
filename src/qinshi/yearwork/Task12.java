package qinshi.yearwork;

import org.junit.Test;

import java.util.Random;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task12
 * @Date 2021/2/18 20:26
 */
/*设计一个方法实现一个验证码功能，参数：String source(验证码的源)，int length(生成验证码长度)*/
public class Task12 {
    @Test
    public void test() throws Exception{
        //调用生成验证码方法
        System.out.println(getCode("ABCDEFghijkl123456听闻远方有你",4));
    }

    public String getCode(String source,int length){
        //定义一个线程安全的StringBuffer，来存放验证码
        StringBuffer code=new StringBuffer();

        //定义一个随机类
        Random random=new Random();

        //遍历验证码源的长度
        for (int i = 0; i <length ; i++) {
            int index=random.nextInt(source.length()); //随机生成一个验证码源的下标（索引）
            code.append(source.charAt(index)); //根据指定索引找对应的字符值，然后拼接在code后面
        }
        return code.toString();  //把StringBuffer转换为字符串，并返回
    }
}
