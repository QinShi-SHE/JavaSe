package qinshi.day18.threeset_04;

import java.util.Objects;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Student
 * @Date 2021/1/24 15:38
 */
/*
创建一个集合，里面存放学生对象
 */
public class Student implements Comparable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        //返回值的含义:如果是0表示两个对象相同，如果是负数，从大到小排序，如果是正数从小到大
        Student s=null;
        if (o instanceof Student){
            s=(Student) o;
        }
       if(this.age>s.age){
           return -1;
       }else if (this.age<s.age){
           return 1;
        }else{
           return this.name.compareTo(s.name);
        }
    }
}
