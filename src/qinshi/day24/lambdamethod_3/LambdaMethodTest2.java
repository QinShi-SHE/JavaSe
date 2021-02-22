package qinshi.day24.lambdamethod_3;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MyTest
 * @Date 2021/2/2 14:25
 */
/*
	4.1. 静态方法引用
			语法 ： 类名::方法名
			注意事项：
				被引用的方法参数列表和函数式接口中抽象方法的参数一致！！
				接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
				接口的抽象方法有返回值，引用的方法必须有相同类型的返回值！！
			由于满足抽象参数列表与引用参数列表相同，所以可以写成静态方法引用的格式
 */
public class LambdaMethodTest2 {
    @Test
    public void test() throws Exception{
        //方式1
        MyInterface my=new MyInterface() {
            @Override
            public int stringToInt(String str) {
                return Integer.parseInt(str);  //将字符串转换为整型
            }
        };
        System.out.println(my.stringToInt("23"));

        //方式2
        MyInterface my2=str -> Integer.parseInt(str);
        System.out.println(my2.stringToInt("23"));

        //静态方法的引用
        MyInterface my3= Integer::parseInt;
        System.out.println(my3.stringToInt("23"));
    }
}
