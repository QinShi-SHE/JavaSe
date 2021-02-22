package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task32
 * @Date 2021/2/19 18:08
 */
/*输入一个字符串变量，将字符串中重复的字符去除后返回。例如("abcdefa") => abcdef(高级)*/
public class Task32 {
    @Test
    public void test() throws Exception{
        System.out.println(filterSame("我aA1,我aA1,3333BBBB"));
    }

    String filterSame(String str){
        StringBuffer sb=new StringBuffer();
        //String str2="";
        for (int i = 0; i < str.length(); i++) {   //遍历字符串中的每一个字符
            char charWord = str.charAt(i);  //获取指定下标的字符
            int firstPosition = str.indexOf(charWord);  //返回指定字符第一次出现的字符串内的索引。
            int lastPosition = str.lastIndexOf(charWord); //返回指定字符的最后一次出现的字符串中的索引。
            if (firstPosition == lastPosition || firstPosition == i) {  //如果该字符第一次出现的索引值和最后一次出现的索引值相等，或者第一次出现的索引值就等于字符串的下标
                sb.append(charWord);  //追加
                //str2+=charWord;  //String也可以，拼接
            }
        }
        return sb.toString();
    }
}
