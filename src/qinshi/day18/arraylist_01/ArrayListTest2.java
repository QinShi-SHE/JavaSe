package qinshi.day18.arraylist_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ArrayListTest2
 * @Date 2021/1/24 10:57
 */
/*
遍历集合中的所有元素
    1.普通for循环
        语法：for(初始值;循环条件;变量的自增自减){}
    2.for-each循环
        语法：for(类型:集合对象)

    迭代器：
         Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。

    迭代器 it 的两个基本操作是 next 、hasNext 和 remove。

    调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。

    调用 it.hasNext() 用于检测集合中是否还有元素。

    调用 it.remove() 将迭代器返回的元素删除。
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String >();
        arrayList.add("听闻");
        arrayList.add("远方");
        arrayList.add("有你");
        arrayList.add("动身");
        arrayList.add("跋涉");
        arrayList.add("千里");

        //可以使用 for 来迭代数组列表中的元素：
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //也可以使用 for-each 来迭代元素：
        for(String i:arrayList){
            System.out.print(i);
        }
        System.out.println("\n");

        //获取迭代器
        Iterator<String> it=arrayList.iterator();
        // 输出集合中的第一个元素
        //System.out.println(it.next());
        // 输出集合中的所有元素
        while (it.hasNext()){  //hasNext()判断是否有元素可以迭代
            System.out.println(it.next());  //next()获取当前的元素
        }
        System.out.println("***************");
        while (it.hasNext()){
            System.out.println(it.next());
            //上面两个while使用的是同一个迭代器，第一个while循环完毕就把指针移动到末尾了，所以第二个while不会执行了
        }
        System.out.println("***************");

        //要删除集合中的元素可以使用 remove() 方法。
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();  // 删除小于 10 的元素
            }
        }
        System.out.println(numbers);
    }
}
