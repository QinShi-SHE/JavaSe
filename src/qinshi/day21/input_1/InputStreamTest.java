package qinshi.day21.input_1;

import qinshi.day21.util.CloseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IuputTest
 * @Date 2021/1/28 10:13
 */
/*
 IO分类：
 					输入流			 		输出流
			字节流	InputStream（抽象类）     	OutputStream（抽象类）
			字符流	Reader （抽象类）       	 	Writer（抽象类）

			从内存到硬盘就是输出流Output  写入
            从硬盘到内存就是输入流Input   读取

 2.字节流：（重点）
 *		使用场景：
 *		1.字节流处理除了文本、文字相关所有的流问题，如，png/jpg/avi/map4/mp3/exe
 *		2.字符流只处理文本、文字相关（编码乱码问题）

  输入流	abstract class InputStream:这个抽象类是表示输入字节流的所有类的超类。
 *								|
 *							FileInputStream 子类:文件字节输入流
 *								1. 构造方法
 *										FileInputStream(String name) 	name：表示(绝对路径、相对路径)文件名
 *										FileInputStream(File file)
 *
 *								2. 普通方法：
									//1. int read(byte[] b) 从输入流读取一些字节数，并将它们存储到缓冲区 b 。  最常用
 *									//2. int read() 从输入流读取数据的下一个字节。
									//3. int read(byte[] b, int off, int len) 	从输入流读取最多 len字节的数据到一个字节数组。
 */
public class InputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis=null;;
        try {
            //创建输入流对象
           fis=new FileInputStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day21\\a.txt");
            System.out.println("*********************第一种****************************");

            //用循环读取文件的内容
//            while (true){
//                int i=fis.read();  //read() 从输入流读取数据的下一个字节。
//                if(i==-1){        //如果读取到最后一个，即=-1，就退出循环
//                    return;
//                }
//                System.out.println(i);
//            }

            int read;
            while ((read=fis.read())!=-1){    //这种等效于上面那一种方法，条件满足的时候，每次都会再读取一次，这样写简化代码
                System.out.print((char) read+"\t");   //read是读取到的一个字节，直接打印不会输出原内容，要char强转，但这只是仅限用read()方法，没有任何参数的方法，因为char只能装一个字节，而这个无参读取只会读取一个字节
            }

            //这种方法与上面简单的循环，等效
            int read2;
            read2=fis.read();  //读取一次文件
            while (read2!=-1){   //发现没有读取完，就循环读取
                System.out.println((char) read2);
                read2=fis.read();   //再次读取
            }

            //创建输入流对象
            FileInputStream fis2=new FileInputStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day21/a.txt");
            System.out.println("\n*********************第二种****************************");
            //第二种读取方式
            /*
            String(byte[] bytes, int offset, int length)
            通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
             */
            int len;  //每次读取的字节个数
            byte[] b=new byte[3];   //每次最多读取的内容大小
            while ((len=fis2.read(b))!=-1){   //read(byte[] b) 从输入流读取一些字节数
                String str=new String(b,0,len);
                System.out.println(str);
            }

            //第三种方式，没必要不建议
//            while ((len=fis.read(b,0,b.length))!=-1){   //read(byte[] b, int off, int len) 	从输入流读取最多 len字节的数据到一个字节数组。
//                String str=new String(b,0,len);
//                System.out.println(str);
//            }
            System.out.println("************************************");
            File file=new File( "D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day21/a.txt");
            FileInputStream fis3=new FileInputStream(file);
            System.out.println((char)fis3.read());  //读一个
            //byte[] b2=new byte[3];
            //System.out.println((char) fis3.read(b2));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            try {
//                if (fis != null) {
//                    fis.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            //CloseUtil.fisClose(fis);
            CloseUtil.closeIO(fis,null);  //或者，第二参数没有，为空
        }
    }
}
