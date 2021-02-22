package qinshi.day10.potting_2;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName User
 * @Date 2021/1/12 14:44
 */
public class UserTest {
    public static void main(String[] args) {
        User u1=new User();
        //地址值是一样，证明是同一个对象
        System.out.println(u1);
        u1.userThis(); //this指代当前对象，即，哪个对象调用就指代哪个对象
        u1.test();

        System.out.println();

        //this指代当前对象，换了其他对象，this代表的就是其对象了
        User u2=new User();
        System.out.println(u2);
        u2.userThis(); //this指代当前对象，即，哪个对象调用就指代哪个对象
        u2.test();
    }
}
