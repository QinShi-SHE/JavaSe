package qinshi.day19.work;

import java.util.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task
 * @Date 2021/1/25 13:51
 */
public class Task4 {
    public static void main(String[] args) {
        String str="QWERTYUIQQQWJHDAADADBBBBCAD";
        char[] charArray = str.toCharArray();  //toCharArray()将此字符串转换为一个新的字符数组。

        HashMap<Object, Integer> hashMap = new HashMap<>();

        for(char i:charArray){
            if(hashMap.containsKey(i)){  //如果这个key存在
                Integer x= hashMap.get(i);  //根据key获取value值
                hashMap.put(i,x+1);  //value值+1
            }else {  //否则不存在
                hashMap.put(i,1);
            }
        }
        System.out.println(hashMap);

        //获取map集合中的所有值
        Collection<Integer> values=hashMap.values();
        //获取最大值
        Integer max=Collections.max(values);

        //遍历map 方法一
        for (Object i:hashMap.keySet()){
            if(hashMap.get(i)==max){
                System.out.println(i+"---"+hashMap.get(i));
            }
        }

        //将map转换为set集合  方法二
        Set<Map.Entry<Object,Integer>> set=hashMap.entrySet();
        //遍历集合中的数据获取到的是一整体的键值对
        for (Map.Entry<Object,Integer> entry:set){
            if(entry.getValue()==max){  //判断集合中的值是否等于最大值
                System.out.println(entry);  //满足要求，输出对应的哪一个键值对
            }
        }
    }
}
