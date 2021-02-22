package qinshi.exam_javase;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test2
 * @Date 2021/2/3 15:53
 */
public class Exam6_2 {
    public static int getCi(String file, String str) throws IOException {
        //计数器
        int count = 0;
        //读取文件中的所有内容
        FileReader in = new FileReader(file);
        int c;
        while ((c = in.read()) != -1) {

            while (c == str.charAt(0)) {
                for (int i = 1; i < str.length(); i++) {
                    c = in.read();
                    if (c != str.charAt(i)){
                        break;
                    }
                    if (i == str.length() - 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(getCi("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\exam_javase\\b.txt","一般"));
    }
}
