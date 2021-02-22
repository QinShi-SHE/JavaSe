package qinshi.day24.lambdamethod_3;

import org.junit.Test;

import java.util.function.Function;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LamMethodTest
 * @Date 2021/2/2 11:26
 */
/*
4.2. 实例方法引用
			语法 ： 对象名::非静态方法名
			注意事项：
				被引用的方法参数列表和函数式接口中抽象方法的参数一致！！
				接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
				接口的抽象方法有返回值，引用的方法必须有相同类型的返回值！！
 */
public class LamMethodTest4 {
    @Test
    public void test() throws Exception{
        /*
		 * 使用匿名内部类的方式去调用抽象方法 实例方法的引用
		 * new Function<T, R>() {};
			T 表示参数的类型
			R 返回的结果类型
			R apply(T t) 将参数T 传入匿名内部类中，处理获取到结果后，将结果返回
			需求：判断字符串 中是否已指定的后缀结束
			判断字符串的后缀为.avi
		*/
        Function<String,Boolean> fun=new Function<String,Boolean>() {
            @Override
            public Boolean apply(String t) {
//               if(t.endsWith(".txt")){
//                   return true;
//               }
//               return false;
                 return t.endsWith(".txt");
            }
        };
        System.out.println(fun.apply("琴师.txt"));

         /*  简化
		被引用的方法参数列表和函数式接口中抽象方法的参数一致！！
		接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
		接口的抽象方法有返回值，引用的方法必须有相同类型的返回值！！
		 	引用的实例方法：boolean endsWith(String suffix)
		 	接口中的方法 ：Boolean apply(String t)
		 	对象名::非静态方法名
	    */
        Function<String,Boolean> fun2=s -> s.endsWith(".txt");
        System.out.println(fun2.apply("琴师.txt"));

        //对象名::非静态方法
        Function<String,Boolean> fun3="是否已指定的结尾.txt"::endsWith;
        System.out.println(fun3.apply("琴师.avi"));
    }
}
