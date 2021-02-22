package qinshi.day15.random_03;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RandomTest
 * @Date 2021/1/20 11:21
 */
/*
随机数
获取的四种方式
    1.Math类中的random方法，0.0~1.0之间
    2.Random类
        int next(int bits)
          生成下一个伪随机数。
        int nextInt(int n)
          返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
   3.从1.7开始Random的子类        ...;....                          [n,m)
          ThreadLocalRandom
   4.UUID 返回32位的随机数，当前时间毫秒数+ip地址,充当唯一标识

 */
public class RandomTest {
    public static void main(String[] args) {
        Random r=new Random();
        int i1=r.nextInt(); //范围太大一般不用
        System.out.println(i1);

        //获取0-指定之间的随机数
        System.out.println(r.nextInt(10));  //[0-10),10取不到，即[0-9]的数

        //获取指定范围的随机数  ThreadLocalRandom
        ThreadLocalRandom localRandom=ThreadLocalRandom.current();  //这样创建对象
        int num=localRandom.nextInt(1,10);  //也是左闭右开
        System.out.println(num);

        //UUID
        System.out.println(UUID.randomUUID());

        //从UUID中获取四位数验证码
        String uuid=UUID.randomUUID().toString();
        System.out.println(Arrays.toString(uuid.split("-")));
        //分割
        String[] str=uuid.split("-");
        System.out.println(str[2]);//去第二段的数

        //获取6位验证码
        String str2=str[0]; //取第一段的数
        //截取
        System.out.println(str2.substring(0,6));

        String str3="我2dg的df4登录接口都是23rdkfs";
        //生成六位验证码
        String code="";
        Random random=new Random();
        for(int i=0;i<6;i++){
            int a=random.nextInt(str3.length());  //随机产生一个0-str3.length之间的数
            code+=str3.charAt(a);  //charAt()获取指定索引的char值，然后再拼接
        }
        System.out.println(code);

    }
}
