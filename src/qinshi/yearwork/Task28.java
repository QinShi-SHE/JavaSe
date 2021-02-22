package qinshi.yearwork;

import org.junit.Test;

import java.util.Locale;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task28
 * @Date 2021/2/19 17:35
 */
/*请将下面所有的文件中选出所有是txt类型的文件，并将该类型文件所有首字母改为大写（中级）,
String[] arr = {"hao.html","Hello.exe","haha.txt","abc.txt","cdf.doc","test.png","test2.jpg"};
*/
public class Task28 {
    @Test
    public void test() throws Exception{
        String[] arr = {"hao.html","Hello.exe","haha.txt","abc.txt","cdf.doc","test.png","test2.jpg"};
        for(String i:arr){
            if(i.endsWith(".txt")){
                //根据首字母下标为0来查找对应的char字符，再转为字符串类型,调用toUpperCase转换大写，后面加上根据首字母进行分割
                System.out.println(String.valueOf(i.charAt(0)).toUpperCase(Locale.ROOT)+i.substring(1));
            }
        }
    }
}
