package qinshi.day24.lambdamethod_3;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LamMethodTest
 * @Date 2021/2/2 11:26
 */
/*
4.3. 构造方法引用
			语法 ：类名::new
			注意事项：
				被引用的类必须存在一个构造方法与函数式接口的抽象方法参数列表一致
 */
public class LamMethodTest3 {
    @Test
    public void test() throws Exception{
        MyInterface2 my=new MyInterface2() {

            @Override
            public MyUser getUser(String str) {
                return new MyUser(str);
            }
        };
        System.out.println(my.getUser("琴师"));


		/*
		 * 语法 ：类名::new
			注意事项：
		 *  	被引用的类必须存在一个构造方法与函数式接口的抽象方法参数列表一致
		 * 		接口中的方法：User getUser(String name);
		 *  	类中的构造方法：public User(String name)
		 */

        MyInterface2 my2=str -> new MyUser(str);
        System.out.println(my2.getUser("香猫"));

        //构造方法的引用
        MyInterface2 my3=MyUser::new;
        System.out.println(my3.getUser("琴师与香猫"));
    }


}
