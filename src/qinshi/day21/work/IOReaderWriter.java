package qinshi.day21.work;

import qinshi.day21.util.CloseUtil;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IOReaderWriter
 * @Date 2021/1/28 19:37
 */
public class IOReaderWriter {
    //字符流的输入与输出
    public static void main(String[] args) {
        FileWriter fw=null;
        FileReader fr=null;
        try {
            fr=new FileReader(new File("src/qinshi/day21/work/a.txt")); //字符输入流  读取  文件
            fw=new FileWriter(new File("src/qinshi/day21/work/b.txt")); //字符输出流  写入  文件   后面带一个true参数，说明要追到后面

            /*
                读取方法
                    int read(char[] c)读取字符到char数组中	最常用
             */
            char[] c=new char[3];
            int len;
            while ((len=fr.read(c))!=-1){
                System.out.print(new String(c,0,len));   //解码
                //写入
                fw.write(c,0,len);
                fw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            CloseUtil.closeIO(fr,fw);
        }

    }
}
