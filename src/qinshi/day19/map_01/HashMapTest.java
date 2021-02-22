package qinshi.day19.map_01;

import java.util.HashMap;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MapTest
 * @Date 2021/1/25 9:48
 */
/*
Map接口与Collection接口没有任何关系
Map:
    HashMap(实现类)
    HashTable（实现类）
        Properties（实现类）
    ConcurrentMap(接口) ConcurrentHashMap

将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。

HashMap不是同步的
同步写法：
  Map m = Collections.synchronizedMap(new HashMap(...));
基于哈希表的 Map 接口的实现。此实现提供所有可选的映射操作，并允许使用 null 值和 null 键。

HashMap()
          构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。
HashMap(int initialCapacity)
          构造一个带指定初始容量和默认加载因子 (0.75) 的空 HashMap。
HashMap(int initialCapacity, float loadFactor)
          构造一个带指定初始容量和加载因子的空 HashMap。
HashMap(Map<? extends K,? extends V> m)
          构造一个映射关系与指定 Map 相同的新 HashMap。

 boolean containsKey(Object key)
          如果此映射包含对于指定键的映射关系，则返回 true。
 boolean containsValue(Object value)
          如果此映射将一个或多个键映射到指定值，则返回 true。
  V get(Object key)
          返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。
 V put(K key, V value)
          在此映射中关联指定值与指定键。
  void putAll(Map<? extends K,? extends V> m)
          将指定映射的所有映射关系复制到此映射中，这些映射关系将替换此映射目前针对指定映射中所有键的所有映射关系。
 V remove(Object key)
          从此映射中移除指定键的映射关系（如果存在）。


 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put("姓名","琴师");
        hashMap.put("年龄",22);
        //重写了toSting方法
        System.out.println(hashMap);

        //不能放重复的key值
        hashMap.put("姓名","篱琴"); //会覆盖
        System.out.println(hashMap);

        //并允许使用 null 值和 null 键。
        hashMap.put(null,null);
        System.out.println(hashMap);

        //get根据Key获取value,如key没有对应的value则返回null
        System.out.println("如key没有对应的value则返回:"+hashMap.get(1));

        //判断有没有这个Key
        System.out.println(hashMap.containsKey("姓名"));
        //判断有没有这个value
        System.out.println(hashMap.containsValue("篱琴"));

        //将一个map集合存放到另一个map中
        HashMap hashMap2=new HashMap();
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);

        //根据key去移除value,返回值是key对应的value
        System.out.println(hashMap.remove("年龄"));
        //没有就返回null
        System.out.println(hashMap.remove(1));
    }
}
