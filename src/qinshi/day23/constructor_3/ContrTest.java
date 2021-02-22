package qinshi.day23.constructor_3;

import org.junit.Test;
import qinshi.day23.user.User;

import java.lang.reflect.Constructor;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ContrTest
 * @Date 2021/1/31 10:37
 */
/*
根据字节码文件获取构造方法、普通方法、字段等


				构造方法		获取构造方法的目的就是为了创建对象		创建对象的目的是：调用非静态的成员（成员变量、普通方法）
				Constructor[] constructors = clazz.getConstructors() 获取public修饰的构造方法数组
				Constructor[] constructors = clazz.getDeclaredConstructors() 获取任意权限的所有构造方法数组
				Constructor constructor = clazz.getConstructor(Class 参数字节码）根据参数类型获取public修饰的指定的的构造方法
				Constructor constructor = clazz.getDeclearConstructor(Class  参数字节码) 获取任意访问权限指定的构造方法

				//通过构造方法对象去用构造方法创建对象 => 相当于new 一个对象
				Object instance  = constructor.newInstance(Object...实参);//可以创建任意访问权限的有参或者无参构造
 */
//@SuppressWarnings("all")  //消除黄色警告
public class ContrTest {
    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException {
        //获取字节码对象
        //全限定名
        //Class cla=Class.forName("qinshi.day23.user.User");
        //类名.class获取

        Class u1= User.class;
        //获取无参构造方法
        Constructor c1=u1.getConstructor();
        //获取有参构造
        Constructor c2=u1.getConstructor(String.class,int.class);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        //获取所有公共的构造方法
        Constructor[] cs=u1.getConstructors();
        for(Constructor i: cs ){
            System.out.println(i);
        }
        System.out.println();

        //忽略访问权限修饰符,可以获取到除public修饰以外的
        Constructor cd1=u1.getDeclaredConstructor();
        Constructor cd2=u1.getDeclaredConstructor(String.class);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println();
        Constructor[] cds=u1.getDeclaredConstructors();
        for(Constructor i:  cds){
            System.out.println(i);
        }
    }
}
