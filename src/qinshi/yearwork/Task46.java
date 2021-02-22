package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task46
 * @Date 2021/2/19 21:31
 */
/*peter piper picked a peck of pickled peppers统计这段绕口令有多少个以p开头的单词*/
public class Task46 {
    @Test
    public void test() throws Exception{
        String str="peter piper picked a peck of pickled peppers";
        int count=0;
        String[] strArray=str.split(" ");
        for (String i:strArray){
            if(String.valueOf(i.charAt(0)).equals("p")){
                count++;
            }
        }
        System.out.println(count);
    }
}
