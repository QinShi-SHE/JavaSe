package qinshi.day23.method_5;

import org.junit.Test;
import qinshi.day23.user.User;

import java.lang.reflect.Method;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MethodTest
 * @Date 2021/1/31 11:21
 */
/*
普通方法	获取普通方法的目的就是为了被 对象或者 类调用 执行
				Method[] methods = clazz.getMethods() 获取public修饰的构造方法数组,有父类中的方法
				Method[] methods = clazz.getDeclaredMethods() 获取任意访问权限所有造方法数组，并且都是自己的方法
				Method method = clazz.getMethod(String methodName,Class... 参数字节码）根据方法名和参数类型获取指定的的方法
					methodName:方法名
					Class：形参类型。如果方法没有形参，则Class可变参数不用写

				Method method = clazz.getDeclaredMethod(String methodName,Class... 参数字节码）根据方法名和参数类型获取指定的的方法
					methodName:方法名
					Class：形参类型。如果方法没有形参，则Class可变参数不用写

				//通过普通方法对象调用执行方法
				method.invoke(Object obj，Object... args);
					obj：对象。如果是对象的方法，就传入一个当前字节码创建的对象，如果是static方法，则写null
					args：就是具体实参
 */
public class MethodTest {
    @Test
    public void test() throws Exception{
        //获取字节码对象
        Class u= User.class;

        //获取指定公共的方法
        Method m=u.getMethod("show");
        Method m2=u.getMethod("show",int.class);
        System.out.println(m);
        System.out.println(m2);

        System.out.println();
        //获取本来和父类中所有的公共方法
        Method[] m3=u.getMethods();
        for(Method i:m3  ){
            System.out.println(i);
        }

        System.out.println("\n");
        //获取指定的方法，忽略访问权限
        Method m4=u.getDeclaredMethod("show1");
        Method m5=u.getDeclaredMethod("show1",int.class);
        System.out.println(m4);
        System.out.println(m5);

        System.out.println();
        //获取本来和父类中所有的方法 忽略访问权限
        Method[] m6=u.getDeclaredMethods();
        for(Method i:m6  ){
            System.out.println(i);
        }
    }

}
