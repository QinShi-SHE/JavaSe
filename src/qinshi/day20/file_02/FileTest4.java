package qinshi.day20.file_02;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTest1
 * @Date 2021/1/27 11:27
 */
/*
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

 String getName()
          返回由此抽象路径名表示的文件或目录的名称。
 */
public class FileTest4 {
    public static void main(String[] args) {

        File file=new File("D:/qinshi/qinshi java/yuanma/javase/project1/javase/src/qinshi/day20");

        //获取满足条件的文件和目录   用list及FilenameFilter
        String[] list=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //System.out.println(dir);  //打印目录
                //System.out.println(name);   //打印文件名及文件或文件夹名
                //获取当前文件夹下面所有以.txt结尾的文件
                if(name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        });
        System.out.println("这种方法打印不会出现路径名\t"+Arrays.toString(list));   //这种方法打印不会出现路径名
        System.out.println("*********************");

        //使用文件名过滤器    用listFiles及FilenameFilter
        File[] list2=file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {  //两个参数，文件目录名，和String类型的文件名或目录名
                //获取当前文件夹下面所有以.txt结尾的文件
                if(name.endsWith(".txt")){      //endsWith()判断String类型是否以指定的“String”结尾
                    return true;
                }
                return false;
            }
        });
        System.out.println("这种方法打印会出现路径名\t\t"+Arrays.toString(list2));
        System.out.println("***************************");

        //通过文件的其他属性过滤,例如字节数   用listFiles及FileFilter
        File[] list3=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {    //一个参数，File类型的文件名或文件夹名
                //System.out.println(pathname);
                //字节数大于8并且以.txt结尾
                if(pathname.length()>8 && pathname.getName().endsWith(".txt")){   //getName()返回以String类似的文件或文件夹名,然后再调用endsWith方法
                    //System.out.println(pathname);
                    return true;
                }
                return false;
            }
        });
        System.out.println("这种方法打印会出现路径名\t\t"+Arrays.toString(list3));

        //不能用list及FileFilter,  因为list()方法参数里面只能接收FilenameFilter，而listFiles()两种都可以接收
//        String[] list4=file.list(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return false;
//            }
//        });
    }
}
