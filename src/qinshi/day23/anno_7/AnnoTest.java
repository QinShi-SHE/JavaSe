package qinshi.day23.anno_7;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/31 15:21
 */
public class AnnoTest {
    @Test
    public void test() throws Exception{
        //获取字节码文件
        Class a=Anno.class;
        Annotation an=a.getAnnotation(Vip.class);
        System.out.println(an);

    }
}

@Vip(vip = 1)
class A{
    @Vip(value = "Vip2",vip = 2)
    public A(){}

    @Vip(value = "Vip3",vip = 3)

    @Deprecated  //@Deprecated 注解用于标识方法已过时，只要是在版本迭代中使用。
    public void eat(){}
}