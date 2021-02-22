package qinshi.day11.equas_05;

import java.util.Objects;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Student
 * @Date 2021/1/14 16:31
 */
public class Student {
    private String name;
    private int age;

    //自己写的equals方法
//    public boolean equals(Student student) {
//        if(name==student.name&&age==student.age){
//            return true;
//        }else{
//            return false;
//        }
//    }

    //普通的写法
//    @Override
//    public boolean equals(Object obj) {  //重写的equals
//        //判断obj能否转为学生对象
//        Student student=null;
//        if(obj instanceof Student){
//             student=(Student) obj;
//        }
//        if(name==student.name&&age==student.age){
//            return true;
//        }else{
//            return false;
//        }
//    }

    //完整写法
//    @Override
//    public boolean equals(Object obj) {  //重写的equals
//        //判断obj能否转为学生对象
//        Student student=null;
//        if(obj instanceof Student){
//             student=(Student) obj;
//        }
//        return name.equals(student.name)&&age==student.age;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
