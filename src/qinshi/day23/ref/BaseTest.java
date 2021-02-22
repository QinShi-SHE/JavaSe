package qinshi.day23.ref;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName BaseTest
 * @Date 2021/1/31 10:28
 */
/*
获取基本数据类型的字节码对象
  8大基本数据类型
 */
public class BaseTest {
    @Test
    public void tset(){
        //基本数据获取
        Class i=int.class;
        Class i2=Integer.class;
        Class i3=Integer.TYPE;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        //void的字节码对象
        Class v=void.class;
        Class v2 = Void.TYPE;
        System.out.println(v);
        System.out.println(v2);
    }
}
