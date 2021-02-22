package qinshi.day18.linkedlist_02;

import java.util.LinkedList;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LinkedListTest
 * @Date 2021/1/24 10:56
 */
/*
以下情况使用 LinkedList :

你需要通过循环迭代来访问列表中的某些元素。
需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。

线程安全写法
LinkedList s= Collections.synchronizedSet(new LinkedList());
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();

        System.out.println(link);
        System.out.println(link.size());

        //将指定元素添加到此列表的结尾。
        link.add(1);
        link.add(1.2);
        link.add('a');
        link.add(0,"今昔");

        System.out.println(link);

        // 使用 addFirst() 在头部添加元素
        link.addFirst("头部");

        // 使用 addLast() 在尾部添加元素  ,add也本身也加到结尾
        link.addLast("尾部");

        link.add(false);
        link.add(null);  //这个会在最后，因为add也是加在结尾
        System.out.println(link);
        /*
        <E> descendingIterator()
          返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。
        E element()
          获取但不移除此列表的头（第一个元素）。
        E get(int index)
          返回此列表中指定位置处的元素。
        E getFirst()
          返回此列表的第一个元素。
         E getLast()
          返回此列表的最后一个元素。
          */
        System.out.println(link.element());   //获取第一个
        System.out.println(link.getFirst());  //获取第一个
        System.out.println(link.peek());     //获取第一个
        System.out.println(link.getLast());   //获取最后一个
        System.out.println(link.get(0));    //获取第一个
    }
}
