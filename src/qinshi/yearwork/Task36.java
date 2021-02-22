package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task43
 * @Date 2021/2/19 18:48
 */
/*String和StringBuffer常见考题*/
public class Task36 {
    @Test
    public void test() throws Exception{
        String textString = new String("java");
        StringBuffer textBuffer = new StringBuffer("java");

        System.out.println(stringReplace(textString) + bufferReplace(textBuffer));  //编译并运行输出Lava   javac
        System.out.println(textString + textBuffer);    //编译并运行输出java    javac
    }

    public static String stringReplace(String text) {
        return text.replace('j', 'L');
    }
    public static StringBuffer bufferReplace(StringBuffer text) {
        return text.append("c");
    }

}
