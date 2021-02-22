package qinshi.day23.method_5;

import org.junit.Test;
import qinshi.day23.user.User;

import java.lang.reflect.Method;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MethodTest2
 * @Date 2021/1/31 11:34
 */
public class MethodTest2 {
    @Test
    public void test() throws Exception{
        //获取字节码对象
        Class u= User.class;

        //通过Class类中的newInstance创建对象
        Object obj =u.newInstance();

        //获取方法
        Method show=u.getMethod("show");  //没有参数
        Method show2=u.getMethod("show",int.class);  //带参的方法
        Method print=u.getMethod("print"); //无参有反
        Method print2=u.getMethod("print",String.class); //有参有反

        //调用方法
        Object inv=show.invoke(obj);    //没有参数
        Object inv2=show2.invoke(obj,2);  //带参的方法
        //像没有返回值的方法，就不用Object接收了,就直接掉方法，如下
        //show.invoke(obj);
        //show2.invoke(obj,2);

        Object inv3=print.invoke(obj); //无参有反
        Object inv4=print2.invoke(obj,"参数哈哈"); //有参有反

        //这两个没有返回值，所以打印会为空
        System.out.println(inv);
        System.out.println(inv2);

        System.out.println(inv3);
        System.out.println(inv4);

        System.out.println();
        //获取私有的方法
        Method show3=u.getDeclaredMethod("show1");
        System.out.println(show3);
        //破坏封装,解除封装限制
        show3.setAccessible(true);
        Object inv5=show3.invoke(obj);
        System.out.println(inv5);
    }
}
