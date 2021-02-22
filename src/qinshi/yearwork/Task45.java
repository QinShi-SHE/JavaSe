package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task45
 * @Date 2021/2/19 21:15
 */
/*给出一句英文句子： "let there be light"得到一个新的字符串，每个单词的首字母都转换为大写*/
public class Task45 {
    @Test
    public void test() throws Exception{
        String str="let there be light";
        String[] strArray=str.split(" ");
        for(String i:strArray){
            //把首字母转换为大写，拼接，截取首字母后的字符串
            System.out.print(String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1)+" ");
        }
    }
}
