package qinshi.day21.reader_4;

import java.io.FileReader;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileReaderTest
 * @Date 2021/1/28 14:32
 */
/*
字符流：（重点）
 *	使用场景：使用于处理文本相关的文件
 *
 *		Reader 抽象类：
 *				|子类
 *			InputStreamReader（转换流）
 *				|子类
 *			FileReader：适用于读取字符相关的文件
 *				1. 构造方法：
 *						1.FileReader(File file)
						2.FileReader(String fileName)	fileName：文件名（相对路径/绝对路径）
 *
 *				2. 读取方法：
 *						3. int read(char[] c)读取字符到char数组中	最常用
 *						2. int read()读取一个字符
 *						3. int read(char[] c,int start,int length)读取制定长度的字符到char数组中
 */
public class FileReaderTest {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("src/qinshi/day21/d.txt");
            //创建一个char类型的数组
            char[] c=new char[3];  //定义一次读取3个字符的char数组，如果这里很大就可以一次性读取完，一排显示
            int len=0;//每次读取的个数
            while ((len=reader.read(c))!=-1){
                //System.out.println(c);
                System.out.println(new String(c,0,len));  //每次读了几个就打印几个
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
