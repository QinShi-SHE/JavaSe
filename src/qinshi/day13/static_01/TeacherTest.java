package qinshi.day13.static_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TeacherTest
 * @Date 2021/1/17 10:41
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher("张三","男");
        Teacher t2=new Teacher("张四","女");

        //没有被static修饰的属性
        System.out.println(t1.sex);
        System.out.println(t2.sex);  //打印的值不一样，各自的值

        //被static修饰的属性
        System.out.println(t1.name);
        System.out.println(t2.name); //打印的值相等，都是为最后一个赋值的属性值!!!!
    }
}
