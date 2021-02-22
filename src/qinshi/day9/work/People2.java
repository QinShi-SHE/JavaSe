package qinshi.day9.work;

import java.util.SplittableRandom;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName People2
 * @Date 2021/1/11 19:31
 */
public class People2 {
    /*
       编写一个程序，输出2个人的基本信息。将每个人的姓名、性别和年龄参数的值传递给构造方法，并显示出相应的信息。
     */
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People2(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People2{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
