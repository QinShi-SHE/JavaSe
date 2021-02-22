package qinshi.day14.stringbuffer_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringBuffer1
 * @Date 2021/1/18 16:20
 */
/*
StringBuffer  线程安全的可变字符序列

append 追加字符串到尾部
insert 插入
StringBuffer reverse()
          将此字符序列用其反转形式取代。

StringBuffer()
          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
StringBuffer(String str)
          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。

StringBuffer只会创建一个对象，效率高于String
 */
public class StringBuffer1 {
    public static void main(String[] args) {
        //有参构造
        StringBuffer buffer=new StringBuffer("琴师");
        System.out.println(buffer.hashCode());
        buffer.append("与香猫");
        System.out.println(buffer.hashCode());
        System.out.println(buffer);

        buffer.insert(0,"头部:");
        System.out.println(buffer);

        //buffer="不能这样"  //这是把字符串赋值给StringBuffer

        //反转
        buffer=new StringBuffer("12345");
        System.out.println(buffer.reverse());
    }
}
