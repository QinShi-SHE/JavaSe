package qinshi.day12.interface_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/15 14:10
 */
public class Test {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("憨憨");
        d.setAge(2);
        d.run();
        d.swing();
        //打印的是具体值，是因为重写了toString()方法
        System.out.println(d);
    }
}
