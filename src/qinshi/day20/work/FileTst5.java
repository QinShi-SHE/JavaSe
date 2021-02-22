package qinshi.day20.work;

import java.io.File;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTst
 * @Date 2021/1/27 15:49
 */
public class FileTst5 {
    public static void main(String[] args) throws Exception {
       findVideo(new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-01-22-定时器-数据结构-Day17"));
    }

    static void findVideo(File file) throws Exception {
        //1.先判断File是否为空，且是否存在
        if(file!=null && file.exists()){  //File存在且不为空
            //2.再判断File是否是文件,且名字是否以.avi结尾
            if(file.isFile() && file.getName().endsWith(".avi")){  //File是文件，且以.avi结尾，这里已经是得到.avi结尾的文件了

                //注意 这里已经是得到.avi结尾的文件了！！！不能在用listFiles()或list()方法来筛选

                //这个方法是针对 ！！目录！！ 下的文件或文件夹，这里已经是文件，所以返回的只能是空
//                File[] list=file.listFiles(new FilenameFilter() {  //返回满足要求的文件，以文件类型的数组为返回值
//                    @Override
//                    public boolean accept(File dir, String name) {
//                        return true;
//                    }
//                });
//                for(File i:list){   //遍历文件数组
//                    File file2=new File("D:/java基础视频/"+i.getName());  //规定路径，得到文件的名字
//                    if(!file2.exists()){  //如果此文件不存在
//                        file2.createNewFile();  //就创建此文件
//                    }else {
//                        throw new Exception("文件已创建！！！");
//                    }
//                }
            }else{ //File不是文件,或者不以.avi结尾
                //判断File是否是文件夹
                if(file.isDirectory()){  //File是文件夹
                    //遍历当前文件夹下所有的子文件夹
                    File[] list2=file.listFiles();
                    //判断子文件夹是否为空
                    if(list2!=null){
                        //遍历文件夹的子文件夹 每一个元素都是一个File
                        for (File i:list2){
                            //递归调用
                            findVideo(i);
                        }
                    }
                }
            }
        }else { //File不存在或者为空
            return;
        }
    }
}
