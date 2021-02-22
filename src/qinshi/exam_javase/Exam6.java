package qinshi.exam_javase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Exam6
 * @Date 2021/2/3 0:12
 */
//6、写一个方法传入一个File对象file和一个字符串str参数，统计这个字符串在这个文件中出现的次数
public class Exam6 {
    public static void main(String[] args) throws Exception {
       System.out.println(countStr(new File("src/qinshi/exam_javase/b.txt"),"如"));
    }
   static int countStr(File file,String str){
       FileReader fr=null;
       int count=0;
      try {

          fr=new FileReader(file);
          char[] c=new char[1];  //定义一次读取1个字符的char数组
          int len; //每次读取的个数
          while ((len=fr.read(c))!=-1){
             //System.out.println(new String(c,0,len));
             String s=new String(c,0,len);
             if(s.equals(str))
                 count++; //统计次数
          }
      } catch (Exception e) {
          e.printStackTrace();
      }finally {
          try {
              if(fr!=null)
                fr.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
      return count;
  }
}
