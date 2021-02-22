package qinshi.day20.work;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTst
 * @Date 2021/1/27 15:49
 */
public class FileTst2 {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-01-22-定时器-数据结构-Day17\\video");
        String[] list=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".avi")){
                    //System.out.println(name);
                    return true;
                }
                return false;
            }
        });
        //System.out.println(Arrays.toString(list));

        File file2=new File("D:/java基础视频");
        for (String i:list){
            System.out.println(i);
        }
    }
}
