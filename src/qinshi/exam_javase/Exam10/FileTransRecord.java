package qinshi.exam_javase.Exam10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FileTransRecord
 * @Date 2021/2/3 13:47
 */
public class FileTransRecord {
    /*
    6.2、解析文件(IO流)，将文件中数据，将每条交易明细封装为1个TransRecord对象。
    所有TransRecord对象，添加到一个集合中，并且打印到控制台；（就是将对象添加到集合并打印集合）
    BufferedReader 方法readLine()
     */

    static BufferedReader br=null;
    static ArrayList<TransRecord> list =new ArrayList<TransRecord>();  //定义一个集合存放对象

    public static void main(String[] args) {

        try {
            br=new BufferedReader(new FileReader("src/qinshi/exam_javase/Exam10/Trancord.txt"));
            String str;
            while ((str=br.readLine())!=null){
                String[] strArry=str.split("  ");  //拆分字符串
                //把每一个值存入对象中
                TransRecord transRecord=new TransRecord(strArry[0],strArry[1],strArry[2],Integer.parseInt(strArry[3]),
                        strArry[4],strArry[5],Double.parseDouble(strArry[6]));
                list.add(transRecord); //对象添加到集合中
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //打印输出
        for(Object i:list  ){  //遍历list集合
            System.out.println(i);
        }
        System.out.println();
        selectTransRecord("00002");  //调用方法

        System.out.println();
        System.out.println("总消费："+sumMoney());

        System.out.println();
        sort();
    }
    //定义一个方法，按金额升序排序，并且打印到控制台；Set自然或定制排序
    static void sort(){
        TreeSet<TransRecord> treeSet=new TreeSet<TransRecord>(list); //要进行排序，创建TreeSet对象，元素类型实现Comparable接口，重写CompareTo方法，自然排序
        for (TransRecord i:treeSet){
            System.out.println(i);
        }
    }

    //定义一个方法，计算总金额并打印到控制台；（遍历集合中对象，获取每个对象的金额相加）
    static double sumMoney(){
        double sum=0;
        for (TransRecord i:list){
            sum+=i.getMoney();
        }
        return sum;
    }

    //完成一个功能（方法）：输入客户号，查询交易明细记录并打印出来，封装成一个方法，通过传入客户号作为参数
    static void selectTransRecord(String id){
        for (TransRecord i:list){
            if(i.getId().equals(id)){
                System.out.println(i);
            }
        }
    }
}
