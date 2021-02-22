package qinshi.day14.stringbuffer_03;

import javafx.beans.binding.StringBinding;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/18 16:34
 */
/*
测试String StringBuffer StringBuilder的效率问题
以字符串拼接为例

1s=1000ms
 */
public class Test {
    public static void main(String[] args) {
        String s="";
        //获取系统当前时间的毫秒数
        long start= System.currentTimeMillis();
        for(int i=0;i<100000;i++){
           // s+=i;  //创建100000个对象
        }
        long end=System.currentTimeMillis();
        //System.out.println(end-start);

        //线程安全的
        StringBuffer s1=new StringBuffer("");
        //获取系统当前时间的毫秒数
        long start1= System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            s1.append(i); //始终都是一个对象
        }
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);

        //线程不安全的
        StringBuilder s2=new StringBuilder("");
        //获取系统当前时间的毫秒数
        long start2= System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            s1.append(i);  //始终都是一个对象
        }
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);

        //返回1970年到现在的时间毫秒数
        System.out.println(System.currentTimeMillis());
    }
}
