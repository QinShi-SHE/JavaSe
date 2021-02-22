package qinshi.day20.file_02;

import java.io.File;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTest1
 * @Date 2021/1/27 11:27
 */
/*
常用方法
 boolean canExecute()
          测试应用程序是否可以执行此抽象路径名表示的文件。
 boolean canRead()
          测试应用程序是否可以读取此抽象路径名表示的文件。
 boolean createNewFile()
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
boolean delete()
          删除此抽象路径名表示的文件或目录。
boolean exists()
          测试此抽象路径名表示的文件或目录是否存在。
 File getAbsoluteFile()
          返回此抽象路径名的绝对路径名形式。
 String getAbsolutePath()
          返回此抽象路径名的绝对路径名字符串。
boolean mkdir()
          创建此抽象路径名指定的目录。
 boolean mkdirs()
          创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。

 */
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File file2=new File("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day20/a.txt");
        //判断文件是否可读可写
        System.out.println("是否可写："+file2.canExecute());
        System.out.println("是否可读："+file2.canRead());

        //创建一个文件
        System.out.println("创建为:"+file2.createNewFile()); //只能创建文件，创建的文件和路径看file
        //删除文件或者文件夹，只能删空文件夹，不为空删除不了
        System.out.println("删除为："+file2.delete());

        System.out.println(file2.getAbsolutePath()); //String
        System.out.println(file2.getAbsoluteFile()); //File

        //获得文件名
        System.out.println(file2.getName());

        /*
         boolean isDirectory()
          测试此抽象路径名表示的文件是否是一个目录。
         boolean isFile()
          测试此抽象路径名表示的文件是否是一个标准文件。
         */
        System.out.println("是否为文件夹："+file2.isDirectory());
        System.out.println("是否为文件："+file2.isFile());

        //返回文件的长度
        System.out.println("文件里面的字节数："+file2.length());

        //创建目录
        File file3=new File("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day20/doc");
        System.out.println(file3.mkdir());  //父目录不存在时，不能创建

        File file4=new File("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day20/doc2/a/b");
        file4.delete();
        //父目录不存在时，会自动创建
        System.out.println(file4.mkdirs());

        /*
        static File[] listRoots()
          列出可用的文件系统根。
         */
        File[] files=File.listRoots();
        for(File i:files){
            System.out.println(i);
        }
    }
}
