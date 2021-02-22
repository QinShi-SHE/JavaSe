package qinshi.day14.string_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringTest2
 * @Date 2021/1/18 14:32
 */
/*
字符串常用方法：
    char charAt(int index)
          返回指定索引处的 char 值。

    String concat(String str)
          将指定字符串连接到此字符串的结尾。

    boolean contains(CharSequence s)
          当且仅当此字符串包含指定的 char 值序列时，返回 true。

    boolean endsWith(String suffix)
          测试此字符串是否以指定的后缀结束。

    int indexOf(int ch)
          返回指定字符在此字符串中第一次出现处的索引。
    int indexOf(int ch, int fromIndex)
          返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。

   boolean isEmpty()
          当且仅当 length() 为 0 时返回 true。

   int lastIndexOf(int ch)
          返回指定字符在此字符串中最后一次出现处的索引。
   int lastIndexOf(int ch, int fromIndex)
          返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。

   String replace(char oldChar, char newChar)
          返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。

   String[] split(String regex)
          根据给定正则表达式的匹配拆分此字符串。

    String substring(int beginIndex)
          返回一个新的字符串，它是此字符串的一个子字符串。

   数组的长度    数组名.length        属性
   字符串的长度   对象名.length()     方法
 */
public class StringTest2 {
    public static void main(String[] args) {
        String str = "我们一起,学猫叫,";
        //根据下标获取对应的字符
        char c =str.charAt(0);
        System.out.println(c);

        //拼接字符串到尾部，并返回一个新的字符串
        str=str.concat("一起,喵喵喵");
        System.out.println(str);

        //判断字符串中有没有指定的值,返回true或false
        System.out.println(str.contains("猫"));

        //判断字符串是否以指定的值结束
        System.out.println(str.endsWith("喵"));

        //查看某一个字符串第一次出现的索引值
        System.out.println(str.indexOf("一"));
        //查看某一个字符串第一次出现的索引值,从指定的索引开始找，如果不存在返回-1
        System.out.println(str.indexOf("一",4));

        //打印字符串长度
        System.out.println(str.length());
        //判断当前字符串是否为空,长度为0时返回true
        System.out.println(str.isEmpty());
        System.out.println("".length());
        System.out.println("".isEmpty());  //true
        System.out.println(" ".length());
        System.out.println(" ".isEmpty());  //false

        //返回最后一次出现的索引
        System.out.println(str.lastIndexOf("喵"));

        //字符串的替换，替换所有满足要求的
        System.out.println(str.replace("一","二"));

        //字符串的分割 ,根据指定的符号进行分割
        String[] str2=str.split(",");
        for(String s:str2){  //遍历
            System.out.println(s);
        }
//        System.out.println(str2[0]);
//        System.out.println(str2[1]);
//        System.out.println(str2[2]);

        //字符串的截取
        System.out.println(str.substring(4));
        //截取一段范围，从起始下标开始，不包括结束的下标
        System.out.println(str.substring(2,4));
    }
}
