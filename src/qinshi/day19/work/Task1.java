package qinshi.day19.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/25 18:51
 */
/*
1、有如下的一个字符串  String str = “QWERTYUIQQQWJHDAADADBBBBCAD”;
① 请统计出其中每一个字母出现的次数，在控制台打印如下的格式：
	A----3
	B----4
	C----1
	D----2
② 请打印出字母次数最多的那一对
 */
public class Task1 {
    public static void main(String[] args) {
        String str = "QmkWERTYUIQQQWJHDAADADBBBBCAD";

        char[] charArray=str.toCharArray(); //将字符串转为字符组数

        ArrayList arrayList=new ArrayList(); //定义一个集合接收字符数组

        for(char i: charArray ){
            arrayList.add(i);     //把字符数组遍历到集合中
        }

        HashMap<Object, Integer> hashMap=new HashMap<>();  //定义一个HashMap来接收每个字符和对应字符出现的次数

        for(Object i:arrayList){   //遍历ArrayList
            int count=Collections.frequency(arrayList,i);  //frequency 返回指定 collection 中等于指定对象的 元素数。
            hashMap.put(i,count);  //将字符和个数，存入HashMap中
        }

        for(Object i:hashMap.keySet()){  //遍历HashMap,按照对应的格式输出
            System.out.println(i+"---"+hashMap.get(i));
        }

        System.out.println("*****************************");
        int max=0;
        for (Object i:hashMap.keySet()){
            if(hashMap.get(i)>=max){
                max=hashMap.get(i);
                System.out.println(i+"---"+hashMap.get(i));
            }
        }
    }
}
