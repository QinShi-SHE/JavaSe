package qinshi.day18.hashset_03;

import java.util.HashSet;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName HashSetTast3
 * @Date 2021/1/24 15:40
 */
/*
判断是否重复的标准
    两个对象的hashcode和equals都要相等
 */
public class HashSetTast3 {
    public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();

        Student s1=new Student("琴师",21);
        Student s2=new Student("琴师",21);
        set.add(s1);
        set.add(s2);
        System.out.println(set);

    }
}
