package qinshi.day24.lambdamethod_3;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LamMethodTest
 * @Date 2021/2/2 11:26
 */
public class LamMethodTest {
    @Test
    public void test() throws Exception{
        User u=str ->System.out.println(str);
        u.run("Lambda普通用法");

        printString("原来写法",str -> System.out.println(str));
        //简单写法
        printString("静态方法引用",System.out::println);  //实质代码: printString("静态方法引用", (str) -> System.out.println(str));

        System.out.println(getString("静态引用",String::format));
    }

    //定义一个无返值方法，两个参数，一个字符串，一个User接口
    public static void printString(String str,User user){   //有参无返的接口方法
        user.run(str);  //调用接口中的方法，传入字符串
    }

    //定义一个有返值方法，两个参数，一个字符串，一个User接口
    public static String getString(String str,User2 user2){  //有参有反的接口方法
        return user2.run(str);
    }
}
