package qinshi.day21.copy_3;

import qinshi.day21.util.CloseUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName CopyTest
 * @Date 2021/1/28 11:25
 *
 * 实现复制的效果
 * 1.创建一个file对象  起始对象
 * 2.创建一个file对象  目标对象
 *
 * 先 读取  文件--->>内存    输入流
 * 再 写入  内存--->>文件    输出流
 */
public class CopyTest {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            //创建源文件
            File file1=new File("src/qinshi/day21/b.txt");
            //创建目标文件，将源文件复制到这个文件中
            File file2=new File("src/qinshi/day21/c.txt");
            //如果目标文件不存在就应该创建出来
            boolean b=file2.createNewFile();

            fis=new FileInputStream(file1);
            //加上true 会覆盖上一次写入的内容
            fos=new FileOutputStream(file2,true);  //这样每执行一次都会再后面追加一次
            int len=0;
            byte[] fb=new byte[3];
            while ((len=fis.read(fb))!=-1){
                //将每次读取到的字节数写入到文件中
                fos.write(fb,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关流，先开的后关
//            try {
//                if(fos!=null){
//                    fos.close();
//                }
//                if(fis!=null){
//                    fis.close();
//                }
//            }catch (Exception e){

//            CloseUtil.fosClose(fos);
//            CloseUtil.fisCOose(fis);
            CloseUtil.closeIO(fis,fos);   //调用两个参数方法
        }
    }
}
