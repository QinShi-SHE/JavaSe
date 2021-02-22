package qinshi.day21.changestream_7;

import java.io.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ChangeStream
 * @Date 2021/1/28 15:24
 */
/*
 转换流：（重点）	目前唯一一个可以设置字符集的流

		（简单的理解为包装流，就是将字节流包装以下，方便操作文本相关的文件）
 *		使用场景：
 *			别人给提供了字节流，而需要处理文本文件，这时候，就需要用转换流转换一下，更方便处理文本文件
 *
 *		作用：就是一字符流的方式读取或写出文本相关的数据
 *
 *		InputStreamReader：将字节输入流包装一下,让其更适合读取文本文件
 *			构造方法：
 *			1.InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
 *			2.InputStreamReader(InputStream in, String charsetName)
						创建一个使用指定字符集的InputStreamReader。
 *			普通方法：
 *				public int read(char[] cbuf)
 *				int read(char[] cbuf, int offset, int length)

 *		OutputStreamWriter：将字节输出流包装一下,让其更适合写出文本文件
 *			构造方法：
 *			1. OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
 *			2. OutputStreamWriter(OutputStream out, String charsetName)
					创建一个使用指定字符集的OutputStreamWriter。
			普通方法：
				void write(char[] cbuf, int off, int len)
				append(CharSequence csq,int start,int end)

		只有转换流可以设置字符集
 */
public class ChangeStream {
    public static void main(String[] args) {
        try {
            //字节流转字符流 InputStreamReader
            InputStreamReader isr=new InputStreamReader(new FileInputStream(new File("src/qinshi/day21/e.txt")));
            //字符流转字节流 OutputStreamWriter
            OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(new File("src/qinshi/day21/f.txt"),true));

            char[] c=new char[3];
            int len=0;
            while ((len=isr.read(c))!=-1){
                String str=new String(c,0,len);
                //System.out.println(c);
                System.out.println(str);
                //边读边写
                osw.write("\n"+str);
                osw.flush();
            }


            //写的操作
            //OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(new File("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\day21\\c.txt"),true));
            //osw.write("通过转换流");
            //osw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
