package qinshi.day22.model_5;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SingleTest
 * @Date 2021/1/30 15:16
 */
public class SingleTest {
    @Test
    public void test(){
        //单例的懒汉模式
        LazySingle lazySingle1=LazySingle.getInstance();
        LazySingle lazySingle2=LazySingle.getInstance();
        //打印的地址值一样，说明只创建了一个对象
        System.out.println(lazySingle1);
        System.out.println(lazySingle2);
        System.out.println(LazySingle.getInstance());

        System.out.println();
        //单例的饿汉模式
        HungrySingle hungrySingle1=HungrySingle.getInstance();
        HungrySingle hungrySingle2=HungrySingle.getInstance();
        System.out.println(hungrySingle1);
        System.out.println(hungrySingle2);
        System.out.println(HungrySingle.getInstance());
    }
}
