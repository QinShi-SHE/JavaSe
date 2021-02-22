package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task56
 * @Date 2021/2/20 0:14
 */
/*编写一个方法，判断一个字符是否有小写字母，如果是，将它转换成大写字母，否则，不转换。*/
public class Task56 {
    @Test
    public void test() throws Exception{
        String str="abc,我们一起,ABC，xyz,QWE";
        cheekLowerWord(str);
    }

    void cheekLowerWord(String str){
        char[] charArray=str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>=97 && charArray[i]<=122){  //a~z,97~122
                charArray[i]=Character.toUpperCase(charArray[i]);
            }
        }
        str=new String(charArray);  //将转换后的字符数组，转为String类型
        System.out.println(str);
    }
}
