package qinshi.day16.regexp_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RegExpTest
 * @Date 2021/1/21 11:19
 */
/*
正则表达式
    其实就是字符串
 */
public class RegExpTest {
    public static void main(String[] args) {
        //定义一个规则
        String regex="abc[1-9]";
        String s="abc2";
        /*
            boolean matches(String regex)
               告知字符串是否匹配给定的正则表达式
         */
        System.out.println(s.matches(regex));

        String regex2="^[a-zA-Z][2-5]{3}1$";
        String s2="a2341";
        System.out.println(s2.matches(regex2));

        //验证手机号码
        String regex3="^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
        String s3="13784235935";
        System.out.println(s3.matches(regex3));
    }
}
