package qinshi.day20.recursion_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RecursionTest4
 * @Date 2021/1/27 18:47
 */

import java.io.File;

/**
 * 请设计一个方法，传入一个File对象dir（文件夹），删除所有的东西
 * 思路：
 * 		1. 先判断当前dir的合法性：
 * 			1. 先判断dir是否为null ，如果是直接return结束方法
 * 			2. 再判断dir硬盘是否存在，如果不存在直接return结束方法
 * 		2. 获取当前目录下的所有，dir如果是文件，直接删除
 * 			如果是文件夹，则获取dir的下一级所有的子文件和子文件夹。
 * 			如果是文件 直接删
 * 			文件夹 递归调用
 */
public class RecursionTest4 {
    public static void main(String[] args) {
        delAll(new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-01-22-定时器-数据结构-Day17"));
    }

    //获取一个文件路径下面的所有mp4结尾的文件
    public static void delAll(File file){
        /*
         * 	1. 先判断file是否为null ，如果是直接return结束方法
         * 	2. 再判断file硬盘是否存在，如果不存在直接return结束方法
         * 	调用exists 文件或目录存在时，返回 true；否则返回 false
         */
        if(file==null || !file.exists()){
            //结束方法
            return;
        }else{
            /*
             * 获取当前目录下的所有，dir如果是文件，直接删除
             * 	如果是文件夹，则获取dir的下一级所有的子文件和子文件夹。
             *	如果是文件 直接删
             *	文件夹 递归调用
             */
            if(file.isFile()){
                //删除文件
                file.delete();
            }else{
                //遍历当前目录下面的所有子文件夹
                File[] files = file.listFiles();
                //判断数组是否为null
                if(files!=null){
                    //遍历数组中的元素 每一个元素都是一个File
                    for (File file2 : files) {
                        //递归调用
                        delAll(file2);
                    }
                }
                //把文件夹也删除掉
                file.delete();
            }
        }
    }
}
