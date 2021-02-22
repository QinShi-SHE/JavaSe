package qinshi.day15.system_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName A
 * @Date 2021/1/20 10:52
 */
public class A {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("子类的回收方法");
    }
}
