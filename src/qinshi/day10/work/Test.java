package qinshi.day10.work;

import java.util.Locale;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/12 15:50
 */
public class Test {
    /*
        构造方法：String(String str) 创建一个包含指定的str数据的String对象

        普通方法：
            1.char charAt(int index) 返回 index索引处的char字符。 下标[0,length()-1]
            2.boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。
            3.boolean startsWith(String prefix) 判断当前字符串是否以指定的前缀prefix开头。
            4.boolean isEmpty() 当 length()为 0时，返回 true 。
            5.int length() 返回此字符串的长度
            6.String toUpperCase() 将此字符转换为全大写
            7.String toLowerCase()将此字符转换为全小写
            8.String substring(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）

     */
    public static void main(String[] args) {

        String a="ABCD";
        String b="abcd";
        String c="离群所居者，不是神明，便是野兽！";
        System.out.println(new String(c)); //创建一个包含指定的str数据的String对象
        System.out.println(c.charAt(0));  //返回 index索引处的char字符。 下标[0,length()-1]
        System.out.println(c.endsWith("便是野兽！"));
        System.out.println(c.startsWith("离群")); //判断当前字符串是否以指定的前缀prefix开头。
        System.out.println(c.isEmpty());  //判断字符串长度是否为空
        System.out.println(c.length()); // 返回此字符串的长度
        System.out.println(a.toLowerCase());//将此字符转换为全小写
        System.out.println(b.toUpperCase());//将此字符转换为全大写
        System.out.println(c.substring(1,5));//从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
    }
}
