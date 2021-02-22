package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task63
 * @Date 2021/2/20 0:36
 */
/* 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1*/
public class Task63 {
    @Test
    public void test() throws Exception{
        System.out.println(findFirstIndex("leetcode"));
        System.out.println(findFirstIndex("loveleetcode"));
    }

    int findFirstIndex(String str){
        for (int i = 0; i <str.length(); i++) {
            char charWord=str.charAt(i);
            int firstPosition = str.indexOf(charWord);  //返回指定字符第一次出现的字符串内的索引。
            int lastPosition = str.lastIndexOf(charWord); //返回指定字符的最后一次出现的字符串中的索引。
            if (firstPosition == lastPosition ) {  //如果该字符第一次出现的索引值和最后一次出现的索引值相等，或者第一次出现的索引值就等于字符串的下标
               return i;
            }
        }
        return -1;
    }
}
