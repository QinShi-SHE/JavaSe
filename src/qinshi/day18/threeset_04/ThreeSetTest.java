package qinshi.day18.threeset_04;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ThreeSet
 * @Date 2021/1/24 16:04
 */
/*
基于 TreeMap 的 NavigableSet 实现。
使用元素的自然顺序对元素进行排序
或者根据创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法。

TreeSet()
          构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
TreeSet(Collection<? extends E> c)
          构造一个包含指定 collection 元素的新 TreeSet，它按照其元素的自然顺序进行排序。
TreeSet(Comparator<? super E> comparator)
          构造一个新的空 TreeSet，它根据指定比较器进行排序。
TreeSet(SortedSet<E> s)
          构造一个与指定有序 set 具有相同映射关系和相同排序的新 TreeSet。

 */
public class ThreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();

        //在TreeSet中，只能存放同一种数据类型，要么全是int、要么全是String..要么等
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(2);  //相同数据会覆盖
        treeSet.add(-5);

//        treeSet.add("1");
//        treeSet.add("2");
//        treeSet.add("2");

//        treeSet.add("我".hashCode());
//        treeSet.add("的".hashCode());
//        treeSet.add("得分".hashCode());
        System.out.println(treeSet);

        //遍历
        for(Object i:treeSet){
            System.out.println(i);
        }

        //迭代器
        Iterator it=treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
