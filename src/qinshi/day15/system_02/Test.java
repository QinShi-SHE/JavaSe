package qinshi.day15.system_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/20 10:53
 */
public class Test {
    public static void main(String[] args) throws Throwable {
        new A();
        new A();
        //回收垃圾
        System.gc();
        new A().finalize();
    }
}
