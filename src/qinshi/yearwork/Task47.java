package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task47
 * @Date 2021/2/19 21:57
 */
/*把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy*/
public class Task47 {
    @Test
    public void test() throws Exception{
        String str="lengendary";
        char[] charArray=str.toCharArray(); //将字符串改成字符数组
        for (int i = 0; i < charArray.length; i++) {  //遍历字符数组
            if(i%2==0){
                charArray[i]=Character.toUpperCase(charArray[i]);  //将偶数项转换为大写
            }
        }
        /*********打印方式************/

        //1.遍历字符数组
        for(char i:charArray){
            System.out.print(i);
        }
        System.out.println();

        //2.将字符数组转换为字符串
        String newStr=new String(charArray);
        System.out.println(newStr);
    }
}
