package qinshi.day20.work;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTst
 * @Date 2021/1/27 15:49
 */
public class FileTst3 {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-01-22-定时器-数据结构-Day17\\video");
        File[] list=file.listFiles(new FilenameFilter() {
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

        //File file2=new File("D:/java基础视频");
        for(File i: list ){
            //System.out.println(i.getName());
            File file2=new File("D:/java基础视频/"+i.getName());
            try {
                //new File("D:/java基础视频/"+i.getName()).createNewFile();
                if(file2.exists()){
                    //throw new Exception("已存在");
                    System.out.println("已存在!!!");
                }else {
                    file2.createNewFile();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
