package qinshi.yearwork;

import org.junit.Test;

import java.util.Locale;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task16
 * @Date 2021/2/18 21:20
 */
/*设计一个工具类，传入一个aaa_bbb将其转换为 aaaBbb格式*/
public class Task16 {
    @Test
    public void test() throws Exception{
        System.out.println(formatString("xxx_yyy"));
        System.out.println(formatString("xxx_Yyy"));
    }
    public String formatString(String str){
        //定义一个规则
        String rule="^([a-z])\\1{2}[_]([a-z])\\2{2}";
        if(str.matches(rule)){
            String[] strArry=str.split("_"); //分割字符串
            //拼接字符串
            str=strArry[0]+String.valueOf(strArry[1].charAt(0)).toUpperCase(Locale.ROOT)+strArry[1].charAt(1)+strArry[1].charAt(2);
            return str;
        }else
            return "格式错误";
    }
}
