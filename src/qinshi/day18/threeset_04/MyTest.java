package qinshi.day18.threeset_04;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName MyTest
 * @Date 2021/1/24 20:11
 */
public class MyTest {
    public static void main(String[] args) {
        //多态的写法
        Comparator comparator = new MyComparator();
        TreeSet set = new TreeSet(comparator);
        //创建学生对象
        //创建俩个学生对象
        Student s = new Student("琴师", 21);
        Student s1 = new Student("琴猫", 22);
        set.add(s);
        set.add(s1);
        System.out.println(set);
    }
}
