package qinshi.day21.writer_5;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileWriterTest
 * @Date 2021/1/28 14:45
 */
/*
Writer 抽象类：
 *				|子类
 *			OutputStreamWriter（转换流）
 *				|子类
 *			FileWriter：适用于写出字符相关的文件
 *				1. 构造方法：
				 * 		1.FileWriter(File file) 	默认是false
						2.FileWriter(File file, boolean append)
							append：表示是在文件末尾追加还是从头覆盖，如果true追加，false覆盖，默认是false
						3.FileWriter(String fileName) 	默认是false
						4.FileWriter(String fileName, boolean append)
							fileName：文件名（相对路径/绝对路径）
 *				2. 写出方法：
 *						1. public Writer append(CharSequence csq,int start,int end)
 *						2. public Writer append(char c)
 *						3. public Writer append(CharSequence csq)
 *						4. public void write(char[] c)
 *						5. public void write(String str)
 *						6. public void write(String str,int start,int end)
 调用写的方法，是将内容写入到缓冲区，要想到文件中，则需要刷新缓冲区
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("src/qinshi/day21/d.txt",true);
            fw.write("\n我喜欢你，从一而终，认真且怂");
            //刷新
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
