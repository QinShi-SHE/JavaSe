package qinshi.day19.work;

import java.util.*;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task
 * @Date 2021/1/25 13:51
 */
public class Task3 {
    public static void main(String[] args) {
        String str="QWERTYUIQQQWJHDAADADBBBBCAD";
        char[] charArray = str.toCharArray();  //toCharArray()将此字符串转换为一个新的字符数组。

        HashMap<Object, Integer> hashMap = new HashMap<>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();

        //遍历字符数组
        for (int j = 0; j < charArray.length; j++) {
            //使用collections工具类将字符数组添加到集合里面
            Collections.addAll(arrayList2, charArray[j]);
            //使用方法获取到每个字母的次数
            int frequency = Collections.frequency(arrayList2, arrayList2.get(j));
            //分别将字符和次数个数添加到hashmap的键和值里面
            hashMap.put(charArray[j],frequency );
        }

        //获取到hashmap的entry键值对
        Set<Map.Entry<Object, Integer>> entrySet = hashMap.entrySet();
        //遍历获取，拼接格式
        for (Map.Entry<Object, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }
        System.out.println("=============最大的值=================");
        Integer max=0;
        for (Map.Entry<Object, Integer> entry : entrySet) {
            if (max<=entry.getValue()) {
                max=entry.getValue();
                System.out.println(entry.getKey()+"---"+ max);
            }
        }
    }
}
