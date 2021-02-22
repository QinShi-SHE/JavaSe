package qinshi.day21.work;

import qinshi.day21.util.CloseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IOStream
 * @Date 2021/1/28 18:40
 */
public class IOStream {
    //字节流的输入和输出
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(new File("src/qinshi/day21/work/x.txt"));  //字节输入流  读取  文件
            fos=new FileOutputStream(new File("src/qinshi/day21/work/y.txt"),true); //字节输出流  写入  文件   后面带一个true参数，说明要追到后面
            /*
                读取方法
                    int read(byte[] b) 从输入流读取一些字节数，并将它们存储到缓冲区 b  并返回Int类型,  读完了返回-1
                解码方法
                    String(byte[] bytes, int offset, int length)
                        通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
             */
            byte[] b=new byte[3];   //定义读取字节数的byte数组，一次读取三个字节
            int len;    //定义一个int类型的变量来接收 read读取后的 整型值
            while ((len=fis.read(b))!=-1){
                System.out.println(new String(b,0,len));  //将读取到的字节文件 解码 成原文件内容打印
                //读取一次写入一次
                /*
                    写入方法
                        void write(byte[] b, int off, int len) 	将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。  最常用
                 */
                fos.write(b,0,len);
                fos.flush();  //刷新流
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            CloseUtil.closeIO(fis,fos);  //关闭流操作，先开的后关 ，调用工具类里的方法（已经写好了关闭顺序的操作）
        }
    }
}
