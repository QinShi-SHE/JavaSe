package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task21
 * @Date 2021/2/19 15:18
 */
/*String s=”name=zhangsan age=18 classNo=090728”;
将上面的字符串拆分，结果如下 : zhangsan 18 090728
*/
public class Task21 {
    @Test
    public void test() throws Exception{
        String s="name=zhangsan age=18 classNo=090728";
        String[] strArray=s.split(" ");  //先按空格拆分
        for (String i: strArray){
            String[] strArray2=i.split("=");  //再按=拆分
            System.out.print(strArray2[1]+" ");  //只打印每个字符串组数中的第二个值
        }
    }
}
