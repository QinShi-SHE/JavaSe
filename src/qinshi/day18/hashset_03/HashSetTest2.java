package qinshi.day18.hashset_03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName HashSetTest2
 * @Date 2021/1/24 15:23
 */
/*
HashSet遍历方式
    普通for 不行 因为不涉及到下标
    增强for
    迭代器 单向迭代器
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("1");
        hashSet.add("a");
        hashSet.add("即");

        //增强for
        for(String i:hashSet){
            System.out.println(i);
        }

        //迭代器
        Iterator it=hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
