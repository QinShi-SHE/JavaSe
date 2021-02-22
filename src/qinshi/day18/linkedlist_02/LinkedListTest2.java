package qinshi.day18.linkedlist_02;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LinkedListTest2
 * @Date 2021/1/24 14:41
 */
public class LinkedListTest2 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");

        //可以使用 for 配合 size() 方法来迭代列表中的元素：
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }

        //可以使用 for-each 来迭代元素：
        for (String i : sites) {
            System.out.println(i);
        }

        //迭代器遍历
        Iterator it=sites.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
