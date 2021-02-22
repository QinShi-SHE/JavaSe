package qinshi.day18.linkedlist_02;

import java.util.LinkedList;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LinkedListTest3
 * @Date 2021/1/25 9:24
 */
public class LinkedListTest3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        System.out.println(list);

        //注意,每弹出一个，集合长度都会减少一
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.pop());  //E D C
        }

    }
}
