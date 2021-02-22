package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ThreeEyes
 * @Date 2021/1/3 16:06
 */
public class ThreeEyes {
    public static void main(String[] args) {
        /*
                三目运算符：
                    X?Y:Z
                当X为真时，取Y的值，否则取Z的值

                注意
                    如果要用变量接收三目运算符的结果，里面的返回值类型必须保持一致
         */

        int grade = 90;
        System.out.println(grade>60 ? "及格" : "不及格");
        grade=59;
        System.out.println(grade>60 ? "及格" : "不及格");

        String score=grade>60 ? "牛逼" : "2";
        System.out.println(score);
        //String score2=grade>60 ? "牛逼" : 2;  类型不一致,报错
    }
}
