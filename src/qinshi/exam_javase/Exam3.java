package qinshi.exam_javase;

import org.junit.Test;

import java.io.File;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam3
 * @Date 2021/2/2 18:58
 */
public class Exam3 {
    //定义一个方法，查询指定文件夹下所有的MP4文件，并测试
    void findFile(File file) throws Exception{
        //1.先判断File是否为空，且是否存在
        if(file!=null && file.exists()){  //File存在且不为空
            //2.再判断File是否是文件,且名字是否以.avi结尾
            if(file.isFile() && file.getName().endsWith(".avi")){  //如果File是文件，并且以.avi结尾
                System.out.println(file.getName()); //打印输出文件名
            }else{ //File不是文件,或者不以.avi结尾
                //判断File是否是文件夹
                if(file.isDirectory()){          //File是文件夹
                    //遍历当前文件夹下所有的子文件夹
                    File[] list2=file.listFiles();
                    //判断子文件夹是否为空
                    if(list2!=null){            //File不为空
                        for (File i:list2){    //遍历文件夹的子文件夹 每一个元素都是一个File
                            findFile(i);    //递归调用
                        }
                    }
                }
            }
        }else {      //File不存在或者为空
            return;
        }
    }
    @Test
    public void test() throws Exception{
        findFile(new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-2-02-java8新特性-Day24"));
    }
}
