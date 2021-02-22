package qinshi.day21.util;

import java.io.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName CloseUtil
 * @Date 2021/1/28 14:18
 */
/*
工具类
    为了方便使用，将一些重复的代码抽取为一个类，类里面定义一些方法，方便调用
    方法一般定义为static修饰，这样直接类名.方法名,不用创建对象
 */
public class CloseUtil {
    public static void fisClose(FileInputStream fis){
        try {
            if(fis!=null)
                fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fosClose(FileOutputStream fos){
        try {
            if(fos!=null)
                fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //创建两个参数的关闭方法，用于字节流,然后前面两个方法可以不要，只用这一个就行
    public static void closeIO(FileInputStream fis,FileOutputStream fos){
        try {
            //先开的后关
            if(fos!=null){
                fos.close();
            }
            if(fis!=null){
                fis.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //用于关闭字符流的资源方法  方法的重载
    public static void closeIO(Reader reader, Writer writer){
        try {
            if(writer!=null){
                writer.close();
            }
            if(reader!=null){
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
