package qinshi.day15.random_03;

import java.util.Random;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RandomTest2
 * @Date 2021/1/20 14:09
 */
public class RandomTest2 {
    static String str3="我2dg的df4登677录接cvc口87都是23rdkfs发货6r7";

    public static void main(String[] args) {
        System.out.println(getCode(4));
    }

    static String getCode(int num){
        //生成x位验证码
        StringBuffer code=new StringBuffer();
        Random random=new Random();
        //遍历字符串的长度
        for(int i=0;i<num;i++){
            int a=random.nextInt(str3.length());  //随机产生一个0-str3.length之间的数
            code.append(str3.charAt(a));//charAt()获取指定索引的char值，然后再拼接
        }
       return code.toString(); //把StringBuffer转换为字符串，并返回
    }
}
