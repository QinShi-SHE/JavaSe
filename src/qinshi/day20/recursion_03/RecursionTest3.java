package qinshi.day20.recursion_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RecursionTest3
 * @Date 2021/1/27 18:47
 */

import java.io.File;

/**
 *
 * 	请设计一个方法，传入一个File对象dir（文件夹），打印该File对象dir中所有的.mp4文件
 * 思路：
 * 		1. 先判断当前dir的合法性：
 * 			1. 先判断dir是否为null ，如果是直接return结束方法
 * 			2. 再判断dir硬盘是否存在，如果不存在直接return结束方法
 * 			 调用exists 文件或目录存在时，返回 true；否则返回 false

 * 		2. 判断当前dir是否是文件，如果是文件，则再判断是否是.MP4结尾。如果是，则打印输出
 * 			如果是文件夹，则获取dir的下一级所有的子文件和子文件夹。
 * 			先判断当前下一级的合法性，是否为null。
 * 				如果不为null，则遍历所有的子文件和子文件夹。
 * 					就递归调用自己的方法执行上面一模一样的操作（参数就是遍历到的当前文件夹或者文件）。
 *
 *
 */
public class RecursionTest3 {
    public static void main(String[] args) {
        findAllMp4(new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-01-22-定时器-数据结构-Day17"));
    }

    //获取一个文件路径下面的所有mp4结尾的文件
    public static void findAllMp4(File file){
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
             * 这个路径是具体存在的
             * 2. 判断当前dir是否是文件，如果是文件，则再判断是否是.MP4结尾。如果是，则打印输出
             * 			如果是文件夹，则获取dir的下一级所有的子文件和子文件夹。
             * 			先判断当前下一级的合法性，是否为null。
             * 			如果不为null，则遍历所有的子文件和子文件夹。
             * 			就递归调用自己的方法执行上面一模一样的操作（参数就是遍历到的当前文件夹或者文件）
             */
            if(file.isFile() && file.getName().endsWith(".mp4")){
                System.out.println(file.getName());
            }else{
                //遍历当前目录下面的所有子文件夹
                File[] files = file.listFiles();
                //判断数组是否为null
                if(files!=null){
                    //遍历数组中的元素 每一个元素都是一个File
                    for (File file2 : files) {
                        //递归调用
                        findAllMp4(file2);
                    }
                }
            }
        }
    }
}
