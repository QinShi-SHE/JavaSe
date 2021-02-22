package qinshi.day18.threeset_04;



import java.util.TreeSet;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/24 16:24
 */
public class Test {
    public static void main(String[] args) {
        TreeSet set=new TreeSet();

        Student s1=new Student("琴师",21);
        Student s2=new Student("琴师",22);
        set.add(s1);
        set.add(s2);
        System.out.println(set);
    }
}
