package qinshi.day18.arraylist_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ArrayListTest3
 * @Date 2021/1/24 11:41
 */
/*
    双向迭代器
        	Iterator  单项的迭代器接口，从左到右依次获得数据，判断是否有下一个；获得下一个
  		    |-- ListIterator   双向的迭代器接口，它的主要方法如下：
  							  Iterator中有的它也有；
                         	  boolean hasPrevious() 判断是否有上一个；
                              Object  previous() 获得上一个元素；
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList bag = new ArrayList();
        bag.add("电脑");
        bag.add(200);
        bag.add("鼠标");
        bag.add("小人书");
        bag.add("教材");
        bag.add("牛奶");
        // 获得双向的迭代器
        ListIterator iterator = bag.listIterator();
        System.out.println("--------从上到下迭代---------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------从下到上迭代---------");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        /*
        ArrayList 排序
        Collections 类也是一个非常有用的类，位于 java.util 包中，提供的 sort() 方法可以对字符或数字列表进行排序。
         */
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // 数字排序

        for (int i : myNumbers) {
            System.out.print(i+"\t");
        }
    }
}
