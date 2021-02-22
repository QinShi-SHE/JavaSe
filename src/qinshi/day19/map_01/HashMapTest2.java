package qinshi.day19.map_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName HashMapTest2
 * @Date 2021/1/25 11:40
 */
/*
Map的遍历方式 ：
    1. 如果只是获取所有一个值，推荐使用  values()方法
    2. 如果只是获取所有的key，推荐使用keySet()方法
    3. 如果获取所有的key-value，就使用entrySet()，不要用先通过keySet()获取key，再用get()获取具体的value，这样会导致二次查询，效率低下

说明： 只考虑我们自己把放进去的key-value都一个一个拿出来
1、foreach  失败了！
原因：Map和Iterable没有任何关系
2、普通for/ while / do-while   失败
原因： Map中没有通过索引来获得数据的方法
3、迭代器  失败！
原因： ① Map没有实现Iterable接口就没有其中获得迭代器的方法；
   ② Map中也没有自己设计一个获得迭代器的方法

 */
public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(1,"张三");
        hashMap.put(2,"李四");
        hashMap.put(3,"王五");
        hashMap.put(4,"刘六");

        //遍历值value
        System.out.println("******遍历值value*********");
        for (String i: hashMap.values()){
            System.out.println(i);
        }

        //遍历键key
        System.out.println("******遍历键key*********");
        for(Integer i: hashMap.keySet()){
            System.out.println(i);
        }

        //用keySet遍历键和值
        /*
        ① 得到所有的Entry对象  ，通过调用方法  Set  entrySet();
        ② 遍历上面的entry 的集合，依次从每一个Entry对象中取出对应的key-value
         */
        System.out.println("******用keySet遍历键和值*********");
        for (Integer i: hashMap.keySet()){
            System.out.println("Key:"+i+"\tValue:"+ hashMap.get(i));
        }

        //用entrySet遍历键和值
        System.out.println("******用entrySet遍历键和值*********");
        Set entry= hashMap.entrySet();  //转换为set
        for (Object i:entry){
            // 需要把i强制转成 Entry类型
            Map.Entry e=(Map.Entry) i;
            System.out.println("key:"+e.getKey()+"\tValue:"+e.getValue());
        }

        System.out.println("******用迭代器遍历键和值*********");
        Iterator it=entry.iterator();  //转换为迭代器
        while (it.hasNext()){
            Object obj=it.next();
            Map.Entry e=(Map.Entry) obj;

            //System.out.println(obj);
            System.out.println("key:"+e.getKey()+"\tValue:"+e.getValue());
            //System.out.println(it.next());
        }
    }
}
