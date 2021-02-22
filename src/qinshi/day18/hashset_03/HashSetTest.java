package qinshi.day18.hashset_03;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName HashSetTest
 * @Date 2021/1/24 14:55
 */
/*
HashSet 集合里面的元素不可以重复，他不保证迭代顺序
此类允许使用null元素
实现不是同步的，线程不安全
安全写法
Set s=Collections.synchronizedSet(new HashSet())

常用方法；
 boolean add(E e)
          如果此 set 中尚未包含指定元素，则添加指定元素。
 void clear()
          从此 set 中移除所有元素。
 Object clone()
          返回此 HashSet 实例的浅表副本：并没有复制这些元素本身。
 boolean contains(Object o)
          如果此 set 包含指定元素，则返回 true。
 boolean isEmpty()
          如果此 set 不包含任何元素，则返回 true。
 Iterator<E> iterator()
          返回对此 set 中元素进行迭代的迭代器。
 boolean remove(Object o)
          如果指定元素存在于此 set 中，则将其移除。
 int size()
          返回此 set 中的元素的数量（set 的容量）。

 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();

       // 安全写法
        Set s= Collections.synchronizedSet(new HashSet());

        hashSet.add(2);
        hashSet.add(true);
        hashSet.add(null);
        hashSet.add("想念");
        hashSet.add(2);   // 重复的元素不会被添加
        hashSet.add("人间风雨");
        System.out.println(hashSet);

        //可以使用 contains() 方法来判断元素是否存在于集合当中:
        System.out.println(hashSet.contains("人间风雨"));

        //移除元素
        hashSet.remove(2);
        System.out.println(hashSet);

        //清空
        hashSet.clear();
        System.out.println(hashSet);
    }
}
