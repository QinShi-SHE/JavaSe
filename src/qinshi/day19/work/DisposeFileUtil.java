package qinshi.day19.work;

import java.io.*;
import java.util.Properties;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DisposeFileUtil
 * @Date 2021/1/25 17:35
 */
/*
请写一个工具类DisposeFileUtil，该类有两个方法，一个是从硬盘中读取文件，一个是写出到硬盘一个文件
	1. writeToDisk(String fileName);
	2. readFromDisk(String fileName);
	文件名称自定义
   测试类，只需要将两个方法完成功能后打印输出即可
 */
public class DisposeFileUtil {

    //写入文件
    void writeToDisk(String fileName) throws FileNotFoundException {
        Properties prop=new Properties();
        PrintWriter writer=new PrintWriter(fileName);
        //将内容写入缓冲区
        writer.write("a=1");
        //刷新流
        writer.flush();
        //写入
        prop.list(writer);
    }
    void  readFromDisk(String fileName) throws IOException {
        Properties prop=new Properties();
        InputStream inputStream=new FileInputStream(fileName);
        //读取
        prop.load(inputStream);
        System.out.println(prop);
    }
}
