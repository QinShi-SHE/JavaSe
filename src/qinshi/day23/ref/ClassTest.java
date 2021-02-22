package qinshi.day23.ref;

import org.junit.Test;
import qinshi.day23.user.User;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ClassTest
 * @Date 2021/1/31 10:07
 */
/*
语法使用：【重点】
			1. 获取字节码文件	： 获取字节码文件的目的就是为了获取字节码中的字段、构造方法、普通方法等
				1.
					1.1 Class clazz  = Class.forName(全限定路径名) (最多使用)默认就是调用下面的方法
					1.2 static Class<?> forName(String name, boolean initialize, ClassLoader loader)
							name:全限定路径名
							initialize:表示是否初始化，默认是false
							loader：可以指定一个类加载器加载字节码文件

				2. 全限定类名.class		前提是类已经设计好了
				3. 对象名.getClass()	前提是类已经设计好了

				Class类中方法newInstance()：创建当前字节码对象（只能调用无参且是public修饰的构造方法）

 */
public class ClassTest {
    @Test
    public void test() throws ClassNotFoundException {
        //完全限定名
        Class cla=Class.forName("qinshi.day23.user.User");
        System.out.println(cla);

        //类名.class
        Class cla2= User.class;
        System.out.println(cla2);

        //对象名.getClass
        Class cla3=new User().getClass();
        System.out.println(cla3);

        /*

         *			String getName()  获取全限定类名（全限定，包含包名）	Class类中方法
         *			String getSimpleName()   获取类名简称			Class类中方法
         *			Package getPackage()   获取包名				Class类中方法
         */
        System.out.println();
        System.out.println(cla.getName());
        System.out.println(cla.getSimpleName());
        System.out.println(cla.getPackage());
    }
}
