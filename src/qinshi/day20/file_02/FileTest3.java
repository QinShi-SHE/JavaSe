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
  String[] list()
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
 String[] list(FilenameFilter filter)
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 File[] listFiles()
          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
 File[] listFiles(FileFilter filter)
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 File[] listFiles(FilenameFilter filter)
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。

 */
public class FileTest3 {
    public static void main(String[] args) throws IOException {
        File file=new File("D:/qinshi/qinshi java/yuanma/javase/project1/javase/src/qinshi/day20");
        //获取当前目录的所有文件和文件夹下面的文件
        String[] fileArray=file.list();
        //System.out.println(Arrays.toString(fileArray));
        for(String i:fileArray){
            System.out.println(i);
//            File f=new File(file,"/"+i+"");
//            String[] fileArray2=f.list();
//            for(String s:fileArray2){
//                System.out.println(s);
//            }
        }

        File[] list=file.listFiles();
        for(File f:list){
            System.out.println(f);
            File[] list2=f.listFiles();
            for(File f2:list2){
                System.out.println(f2);
            }
        }
    }
}
