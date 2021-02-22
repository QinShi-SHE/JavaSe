package qinshi.day10.potting_2;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName User2Test
 * @Date 2021/1/12 15:20
 */
public class UserTest2 {
    public static void main(String[] args) {
        User2 user2=new User2("琴师",'男',23);
        System.out.println(user2.name+user2.sex+user2.age);

        User2 u1=new User2();
        System.out.println(u1);
        System.out.println(u1.getUer());

        User2 u2=new User2();
        System.out.println(u2);
        System.out.println(u2.getUer());
    }

}
