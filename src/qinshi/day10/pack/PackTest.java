package qinshi.day10.pack;

import java.util.Date;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PackTest
 * @Date 2021/1/12 10:42
 */
public class PackTest {
    /*
           包：简单理解就是一个文件夹
           包名全部小写
           作用：
                用于分类管理项目中的java文件
                避免类名冲突
     */
    public static void main(String[] args) {

        int[] a={1,3};
        //java.util.Arrays 类的全限定名(包名+类名)，当不导入包的时候
        java.util.Arrays.toString(a);

        new Date(); //要导入Date包
    }
}
