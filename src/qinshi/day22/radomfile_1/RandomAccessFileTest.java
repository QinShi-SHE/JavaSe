package qinshi.day22.radomfile_1;

import java.io.RandomAccessFile;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RandomAccessFileTest
 * @Date 2021/1/30 10:17
 */
/*
 随机访问文件类RandomAccessFile：
	1. 概念：支持随机访问文件内容和随机读取文件内容
 	2. 作用：
 			1.断点续传
			2.判断空间是否充足，占用空间

	3. 使用：
		1. 构造方法：
			1.RandomAccessFile(String name, String mode)
		 		创建随机访问文件流，以从中指定名称的文件读取，并可选择写入文件。

				mode - 访问模式："r"只读 ，"rw"读写 	"rws"，或 "rwd"

			2.RandomAccessFile(File file, String mode)
				创建一个随机访问文件流从File参数指定的文件中读取，并可选地写入文件。

		2. 常用方法：
			1. long getFilePointer() 返回此文件中的当前文件的指针位置,不管是读取或写出，指针都会移动位置
				配合seek方法，做断点续传功能
			2. void seek(long pos)
				设置文件指针位置，从该文件的开头测量，发生下一次读取或写入。
				配合getFilePointer方法，做断点续传功能

			3. long length() 返回此文件的大小。
			4. void setLength(long newLength)设置此文件的大小。
				通常用来设置临时文件的大小，以便占用空间

			5. int read(byte[] b) 从该文件读取最多 len个字节的数据到字节数组。
			6. String readLine() 从此文件中读取下一行文本。
			7. void write(byte[] b, int off, int len)
					从指定的字节数组写入 len个字节，从偏移量 off开始写入此文件。
			8. void writeBytes(String s)
					将字符串作为字节序列写入文件。

 	4. 注意事项：
			1. 在输出的时候，没有设置文件指针，会从头开始写数据，之前有的数据会被覆盖
				（不会覆盖所有的，而是新数据所占据的位置）

			2. 每次启动程序，默认的指针在文件的开头
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try(    //采用自动关流
                RandomAccessFile raf=new RandomAccessFile("src/qinshi/day22/radomfile_1/a.txt","rw");
                ) {
            //写入
            //raf.writeChars("晚风间息");
            //raf.writeUTF("sss");
            raf.write(98);
            raf.seek(10);  //设置指针的位置
            raf.write(99);
           //获取上次指针的位置
            System.out.println(raf.getFilePointer());
            System.out.println(raf.readLine());  //读
            System.out.println(raf.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
