package qinshi.day21.work;

import qinshi.day21.util.CloseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTst
 * @Date 2021/1/27 15:49
 */
public class FileTst {
    public static void main(String[] args) throws Exception {
       findVideo(new File("D:\\down\\源码时代\\java1229\\源码每天学习课件\\2021-01-22-定时器-数据结构-Day17"));
    }

    static void findVideo(File file) throws Exception {
        FileInputStream fis=null;
        FileOutputStream fos=null;

        //1.先判断File是否为空，且是否存在
        if(file!=null && file.exists()){  //File存在且不为空

            //2.再判断File是否是文件,且名字是否以.avi结尾
            if(file.isFile() && file.getName().endsWith(".avi")){  //如果File是文件，并且以.avi结尾，就获取文件名来创建文件
                File file2=new File("D:/java基础视频");   //指定目录
                //判断目录是否存在
                if(!file2.exists()){  //如果目录不存在 ，创建目录
                    file2.mkdir();
                }else{              //否则目录存在，创建文件
                    File file3=new File(file2+"/"+file.getName());  //获取文件名，以指定路径
                    //判断文件是否存在
                    if(!file3.exists()){  //如果此文件不存在
                        file3.createNewFile();  //就创建此文件
                        //读写文件，复制内容
                        try {
                            fis=new FileInputStream(file);
                            fos=new FileOutputStream(file3);

                            //读写文件
                            byte[] b=new byte[1024];  //一次读取1kb的内容
                            int len;
                            while ((len=fis.read(b))!=-1){
                                fos.write(b,0,len);
                                //fos.write(b);//这样也可以
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }finally {
                            CloseUtil.closeIO(fis,fos);  //关闭流
                        }
                    }else {
                        throw new Exception("文件已创建！！！");  //文件已创建抛出异常
                    }
                }
            }else{ //File不是文件,或者不以.avi结尾

                //判断File是否是文件夹
                if(file.isDirectory()){          //File是文件夹
                    //遍历当前文件夹下所有的子文件夹
                    File[] list2=file.listFiles();
                    //判断子文件夹是否为空
                    if(list2!=null){            //File不为空
                        for (File i:list2){    //遍历文件夹的子文件夹 每一个元素都是一个File
                            findVideo(i);    //递归调用
                        }
                    }
                }
            }
        }else {      //File不存在或者为空
            return;
        }
    }
}
