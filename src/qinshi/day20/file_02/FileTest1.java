package qinshi.day20.file_02;

import java.io.File;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTest1
 * @Date 2021/1/27 11:27
 */
/*
File 文件类
文件和目录路径名的抽象表示形式。
全局属性
    static String pathSeparator
          与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
    static char pathSeparatorChar
              与系统有关的路径分隔符。

构造方法
    File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
    File(String pathname)
              通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
    File(String parent, String child)
            根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。

普通方法
     boolean createNewFile()
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 */
public class FileTest1 {
    public static void main(String[] args) {
        //查看系统有关的分隔符
        System.out.println(File.separator);  // 打印为 \
        System.out.println(File.pathSeparator); // 打印为 ;

        //方式1
        //File parent=new File("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi"); //或者这样
        File parent=new File("D:/QinShi\\Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi");
        //父级目录是File类型
        File file=new File(parent,"/1.txt");  //传的File
        System.out.println(file);
        System.out.println("是否存在："+file.exists());

        //方式2
        String parent2="D:/QinShi\\Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi";
        //父级目录是字符串类型
        File file1=new File(parent2,"/2.txt");  //传的是字符串
        System.out.println(file1);

        //方式3
        //没有父级目录
        File file2=new File("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/3.txt");
        System.out.println(file2);

    }
}
