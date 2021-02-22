package qinshi.day13.static_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Teacher
 * @Date 2021/1/17 10:40
 */
public class Teacher {
    static String name; //被static修饰的成员，会被当前这个类的所有对象共享！！！ 实用：火车站卖票，总票数一样，但是有很多个窗口(对象)，卖一张少一张
    String sex;

    public Teacher(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
