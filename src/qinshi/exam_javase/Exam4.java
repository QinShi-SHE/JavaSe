package qinshi.exam_javase;

import org.junit.Test;

import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Exam4
 * @Date 2021/2/2 19:11
 */
public class Exam4 {
    /*
    有如下的一个字符串 String  str = “ksjhfkjashfkahfkahfiuuytwurekahd”;
	① 请统计出其中每一个字母出现的次数，并把结果保存到一个文件中去：（5分）
	② 请打印出字母次数最多的那一对（5分）
     */
    @Test
    public void test() throws Exception{
        String  str = "ksjhfkjashfkahfkahfiuuytwurekahd";
        char[] charArray = str.toCharArray();  //toCharArray()将此字符串转换为一个新的字符数组。

        HashMap<Object, Integer> hashMap = new HashMap<>();  //定义一个HashMap来存放，字母，及每个字母出现的次数
        FileOutputStream fos=new FileOutputStream("D:\\QinShi\\Qinshi Java\\YuanMa\\JavaSe\\Project1\\JavaSe\\src\\qinshi\\exam_javase\\a.txt");

        for(char i: charArray ){  //遍历字符数组
            if(hashMap.containsKey(i)){     //如果这个key存在
                Integer x= hashMap.get(i);  //根据key获取value值
                hashMap.put(i,x+1);  //value值+1
            }else {
                hashMap.put(i,1);
            }

        }
        System.out.println(hashMap);

        //获取Hashmap集合中的所有值
        Collection<Integer> values=hashMap.values();
        //获取最大值
        Integer max= Collections.max(values);

        for(Object i: hashMap.keySet() ){  //遍历统计好的HashMap，把键值对写入a.txt文件中
            String s=i+"="+hashMap.get(i)+"\n";
            byte[] b=new byte[3];
            b=s.getBytes();
            fos.write(b);
            fos.flush();  //刷新

            if(hashMap.get(i)==max){  //如果遍历到的value是最大值，就打印
                System.out.println(i+"="+hashMap.get(i));
            }
        }
        fos.close(); //关流
    }
}
