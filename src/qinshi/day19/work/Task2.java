package qinshi.day19.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/25 18:13
 */
/*
有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。
           思路：用ASSI码值进行判断
 */
public class Task2 {
    public static void main(String[] args) {
        String str="2020love听闻余生2021QinShi诗与琴猫";
        int chaNum=0;
        int enNum=0;
        int number=0;

        //toCharArray()将此字符串转换为一个新的字符数组。
        char[] arrstr=str.toCharArray();

        //遍历字符数组
        for(char i: arrstr ){
           if(i>=48 && i<=57){  //数字0~9的ASSI码值在48~57
               number++;
           }else if(i>=65&&i<=90 || i>=97&&i<=122){  //A~Z,65~90;a~z,97~122
               enNum++;
           }else {
               chaNum++;
           }
        }
        System.out.println("中文字符个数："+chaNum+"\t英文字符个数："+enNum+"\t数字字符个数："+number);
    }
}
