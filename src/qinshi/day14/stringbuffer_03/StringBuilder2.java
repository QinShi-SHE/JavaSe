package qinshi.day14.stringbuffer_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringBuilder
 * @Date 2021/1/18 16:31
 */
/*
StringBuilder  线程不安全的可变字符序列
    效率高于String
    效率：StringBuilder>StringBuffer>String
 */
public class StringBuilder2 {
    public static void main(String[] args) {
        //有参构造
        StringBuilder buffer=new StringBuilder("琴师");
        System.out.println(buffer.hashCode());
        buffer.append("与香猫");
        System.out.println(buffer.hashCode());
        System.out.println(buffer);

        buffer.insert(0,"头部:");
        System.out.println(buffer);

        //buffer="不能这样"  //这是把字符串赋值给StringBuffer

        //反转
        buffer=new StringBuilder("12345");
        System.out.println(buffer.reverse());
    }
}
