package qinshi.day16.exception_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exception
 * @Date 2021/1/21 9:48
 */
/*
运行时异常：一定要修改代码
编译时异常

异常的解决方式
    1.捕获异常 try-catch
         try{
            //可能出现异常的代码
        }catch (Exception e){
            //解决办法
        }
    2.抛出异常
        throws Exception
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            //数组下标越界
            int[] i={1,3};
            System.out.println(i[3]);
        }catch (Exception e){
            //e.printStackTrace();//输出异常
        }
        System.out.println("跳出异常");

        SimpleDateFormat sdf=new SimpleDateFormat();
        try {
            //编译时异常
            sdf.parse("2020");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
