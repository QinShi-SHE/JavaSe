package qinshi.day19.propreties_02;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PropretiesTest
 * @Date 2021/1/25 15:22
 */
/*
Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
Properties

Properties()
          创建一个无默认值的空属性列表。
 Object setProperty(String key, String value)
          调用 Hashtable 的方法 put。

  作用
       将内存中的数据写入到硬盘中  内存-磁盘 写入  输出
        void list(PrintStream out)
          将属性列表输出到指定的输出流。
        void list(PrintWriter out)
          将属性列表输出到指定的输出流。

       将硬盘中的数据读取到内存中  磁盘-内存 读取  输入
         void load(InputStream inStream)
          从输入流中读取属性列表（键和元素对）。
        void load(Reader reader)
          按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。

 */
public class PropertiesTest {
    public static void main(String[] args) throws FileNotFoundException {
        Properties prop=new Properties();

//        prop.setProperty("username","amin");
//        System.out.println(prop);
//
//        System.out.println(prop.getProperty("username"));
//        System.out.println(prop.get("username"));

        /*将代码内容写入到文件中
          1.创建Properties对象
          2.调用List方法将内容写到文件中
                PrintWriter(String fileName)
                    创建具有指定文件名称且不带自动行刷新的新 PrintWriter。
                void write(String s)
                    写入字符串。
         */

        //创建PrintWriter对象
        PrintWriter printWriter=new PrintWriter("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day19/propreties_02/user.properties");
        //将内容写入缓冲区
        printWriter.write("www");
        //刷新缓冲区
        printWriter.flush();
        prop.list(printWriter);

        //使用PrintStream类来实现写入操作
        //先设置值
        prop.setProperty("name","admin");
        //创建PrintStream对象
        PrintStream printStream=new PrintStream("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day19/propreties_02/user.properties");
        prop.list(printStream);
    }
}
