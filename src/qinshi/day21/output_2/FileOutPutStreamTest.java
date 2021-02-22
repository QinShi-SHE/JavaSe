package qinshi.day21.output_2;

import qinshi.day21.util.CloseUtil;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileOutPutStreamTest
 * @Date 2021/1/28 11:05
 */
/*
	输出流	abstract class OutputStream:这个抽象类是表示输出字节流的所有类的超类。
 *								|
 *							FileOutputStream 子类:文件字节输出流
 *								1. 构造方法
										FileOutputStream(String name) 		name：表示(绝对路径、相对路径)文件名
										FileOutputStream(String name, boolean append)
										append：表示是否在该文件末尾追加数据，如果为true，表示追加，false，表示从头开始覆盖
 *										FileOutputStream(File file)
										FileOutputStream(File file, boolean append)
 *
 *								2. 普通方法：
									//1. void write(byte[] b, int off, int len) 	将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。  最常用
 *									//2. void write(byte[] b)将 b.length个字节从指定的字节数组写入此文件输出流。
									//3. void write(int b) 将指定的字节写入此文件输出流。
		 注意事项：
				1. 必须要关闭IO流，节约资源开销
				2. 关闭IO流原则，先开后关
 */
public class FileOutPutStreamTest {
    public static void main(String[] args) {
        FileOutputStream fout=null;
        try {
            //创建一个输出流写入
            //写入的数据会覆盖
           fout=new FileOutputStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day21\\b.txt");
            byte[] b=new byte[3];
            String str="LiQin";
            b=str.getBytes();   //将字符串转为byte类型
            fout.write(b);
            //写入的数据不会覆盖
            fout=new FileOutputStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day21\\b.txt",true);
            byte[] b2=new byte[3];
            String str2="  QinShi";
            b2=str2.getBytes();
            fout.write(b2);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //不管是否发生异常，都需要关闭流资源
            //关闭方法 close()
//            try {
//                if(fout!=null)
//                    fout.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            CloseUtil.fosClose(fout);
            //CloseUtil.closeIo(null,fout);  或者这样
        }
    }
}
