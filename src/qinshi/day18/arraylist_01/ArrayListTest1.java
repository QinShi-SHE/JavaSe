package qinshi.day18.arraylist_01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ArrayListTest1
 * @Date 2021/1/24 9:38
 */
/*
List集合
ArrayList  底层基于数组实现的
List 接口的大小可变数组的实现。实现了所有可选列表操作，并允许包括 null 在内的所有元素。
除了实现 List 接口外，此类还提供一些方法来操作内部用来存储列表的数组的大小。（此类大致上等同于 Vector 类，除了此类是不同步的。）

以下情况使用 ArrayList :

频繁访问列表中的某一个元素。
只需要在列表末尾进行添加和删除元素操作。

构造方法
    ArrayList()
          构造一个初始容量为 10 的空列表。
    ArrayList(Collection<? extends E> c)
          构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
    ArrayList(int initialCapacity)
          构造一个具有指定初始容量的空列表。

 常用方法
 boolean add(E e)
          将指定的元素添加到此列表的尾部。
 void add(int index, E element)
          将指定的元素插入此列表中的指定位置。
boolean addAll(Collection<? extends E> c)
          按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。
 boolean addAll(int index, Collection<? extends E> c)
          从指定的位置开始，将指定 collection 中的所有元素插入到此列表中。
 void clear()
          移除此列表中的所有元素。
 Object clone()
          返回此 ArrayList 实例的浅表副本。复制一份
 boolean contains(Object o)
          如果此列表中包含指定的元素，则返回 true。
 E get(int index)
          返回此列表中指定位置上的元素。
 int indexOf(Object o)
          返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
 boolean isEmpty()
          如果此列表中没有元素，则返回 true
 int lastIndexOf(Object o)
          返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。
 E remove(int index)
          移除此列表中指定位置上的元素。
 boolean remove(Object o)
          移除此列表中首次出现的指定元素（如果存在）。

 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        //创建一个集合的对象
        ArrayList arr1=new ArrayList();
        System.out.println(arr1.size());

        //在添加数据时会设置容量为10
        arr1.add(1);
        arr1.add("憨憨");
        arr1.add(1,'a'); //只能添加已经有了索引的长度，不能超过长度
        arr1.add(true);
        arr1.add(1);
        arr1.add(20);

        //打印了具体值，是因为重写了toString方法，在父类AbstractCollection<E>中
        System.out.println(arr1);
        System.out.println(arr1.size());

        //复制一份，返回对象类型
        Object a=arr1.clone();
        System.out.println(a);

        //一个集合添到另一个集合
        ArrayList arr2=new ArrayList();
        arr2.addAll(arr1);
        System.out.println(arr2);

        //清空所有元素
        arr2.clear();
        System.out.println(arr2);//打印空数组

        //查找是否有指定的元素
        System.out.println(arr1.contains("憨憨"));

        //获取指定下标的元素
        System.out.println(arr1.get(1));

        //返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
        System.out.println(arr1.indexOf(true));

        //如果此列表中没有元素，则返回 true
        System.out.println(arr2.isEmpty());

        //返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。
        System.out.println(arr1.lastIndexOf(1));

        /*
            E remove(int index)   //默认当下标
                移除此列表中指定位置上的元素。
            boolean remove(Object o)
                移除此列表中首次出现的指定元素（如果存在）。

            在集合中存放数字，最好用字符串格式
         */
        System.out.println(arr1);
        System.out.println(arr1.remove(1));
        System.out.println(arr1.remove("憨憨"));  //删除成功返回true
        System.out.println(arr1);

        /*
         E set(int index, E element)
          用指定的元素替代此列表中指定位置上的元素。
         */
        arr1.set(3,"三");
        System.out.println(arr1);

        /*
           Object[] toArray()
          按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。
         */
        Object[] s=new Object[10];
        s=arr1.toArray();
        System.out.println();
        System.out.println(Arrays.toString(s));
        ArrayList<String> arrayList=new ArrayList<String>();
    }
}
