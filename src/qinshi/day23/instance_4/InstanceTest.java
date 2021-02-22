package qinshi.day23.instance_4;

import org.junit.Test;
import qinshi.day23.user.User;

import java.lang.reflect.Constructor;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName InstanceTest
 * @Date 2021/1/31 11:09
 */
/*
创建对象
    1.获取字节码文件对象
    2.获取构造方法
    3.创建对象
 */
public class InstanceTest {
    @Test
    public void test() throws Exception{
        //获取字节码文件对象
        Class u= User.class;
        //获取无参构造方法
        Constructor c=u.getConstructor();
        User user=(User) c.newInstance();
        System.out.println(user);

        //获取有参数的构造方法
        Constructor c2=u.getConstructor(String.class,int.class);
        User user1=(User) c2.newInstance("琴师",20);
        System.out.println(user1);

        //调用Class类中的方法newInstance创建对象
        Object obj =u.newInstance();
        System.out.println(obj);
    }
}
