package qinshi.day11.object_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ObjectTest
 * @Date 2021/1/14 15:16
 */
public class ObjectTest {
    /*
           Object类是所有类的父类
           每个类都是用Object作为超类
     */
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu2=new Student();
        Class c1=stu.getClass();
        System.out.println(c1);

        System.out.println(stu.hashCode());
        System.out.println(stu2.hashCode());

        System.out.println(stu.toString());
        System.out.println(stu2.toString());
    }
}
