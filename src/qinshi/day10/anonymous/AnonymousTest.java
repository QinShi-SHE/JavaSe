package qinshi.day10.anonymous;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AnonymousTest
 * @Date 2021/1/12 10:12
 */
public class AnonymousTest {
    public static void main(String[] args) {
        /*
            匿名对象：匿名对象，就是创建了一个对象而没有使用变量接收
            注意：只能使用一次
           使用场景：只需要使用一次的情况
           每次new一次就是一个新对象
         */
        //匿名对象
        new User();
        new User().name="琴师";
        System.out.println(new User().name); //null

        //匿名对象调用方法
        new User().eat();

        test(new User());
    }

    //test方法中需要一个User对象
    public static void test(User user){
        System.out.println(user);
    }
}
