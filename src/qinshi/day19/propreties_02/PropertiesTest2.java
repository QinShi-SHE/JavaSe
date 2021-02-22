package qinshi.day19.propreties_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PropertiesTest2
 * @Date 2021/1/25 15:55
 */
/*
 将硬盘中的数据读取到内存中  磁盘-内存 读取  输入
         void load(InputStream inStream)
          从输入流中读取属性列表（键和元素对）。
          InputStream是一个抽象类，要用它的子类FileInputStream
        void load(Reader reader)
          按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        Properties prop=new Properties();
        //FileInputStream file=new FileInputStream("user.properties");
        InputStream file=new FileInputStream("D:/QinShi/Qinshi Java/YuanMa/JavaSe/Project1/JavaSe/src/qinshi/day19/propreties_02/a.txt");//多态写法
        //读取文件
        prop.load(file);
        //根据键去获取文件中的值
        System.out.println(prop.getProperty("name"));
        System.out.println(prop);
//        for(Object i:prop.values()  ){
//            System.out.println(i);
//        }
    }
}
