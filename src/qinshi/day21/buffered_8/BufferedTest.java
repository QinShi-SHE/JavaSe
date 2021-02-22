package qinshi.day21.buffered_8;

import qinshi.day21.util.CloseUtil;

import java.io.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BufferedTest
 * @Date 2021/1/28 16:15
 */
/*
缓冲流：（重点）包装流
 *		1.概念： 提高读取和写出效率的流
 *		2.作用： 提高效率
 		3.使用场景：以后一律都要使用，以提高效率		建议以后都是用字节或者字符数组的方式复制文件，这样效率最高
 *		4.
 *			BufferedInputStream
 *				字节输入缓冲流构造方法：
		 		1.BufferedInputStream(InputStream in) 创建一个默认缓冲区大小的缓冲流
				2.BufferedInputStream(InputStream in, int size)创建一个指定缓冲区大小的缓冲流

 *			BufferedOutputStream
 				字节输出缓冲流构造方法：
				1.BufferedOutputStream(OutputStream out)
				2.BufferedOutputStream(OutputStream out, int size)
 *
 *			BufferedReader
 				 字符输入缓冲流构造方法：
		 		1.BufferedReader(Reader in) 创建一个默认缓冲区大小的缓冲流
				2.BufferedReader(Reader in, int size) 创建一个指定缓冲区大小的缓冲流
 *
 				特殊的读取方法，其他读取方法跟字符流一样：
 					String readLine()读取一行字符串

 *			BufferedWriter
				字符输出缓冲流构造方法：
				1.BufferedWriter(Writer out)
				2.BufferedWriter(Writer out, int size)

				特殊的写出方法，其他写出方法跟字符流一样：
 					writer（String str）
 *					newLine()写出一个换行符
 */
public class BufferedTest {
    public static void main(String[] args) {
        BufferedReader bur=null;
        BufferedWriter buw=null;
        try {
           bur=new BufferedReader(new FileReader("src/qinshi/day21/node.txt"));
           buw=new BufferedWriter(new FileWriter("src/qinshi/day21/node2.txt"));
           String str="";
           while ((str=bur.readLine())!=null){
               buw.write(str);
               //写完一行换行写
               buw.newLine();
           }
           //刷新
            buw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            CloseUtil.closeIO(bur,buw);
        }
    }
}
