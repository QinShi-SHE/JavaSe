package qinshi.day22.util_3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringUtil
 * @Date 2021/1/30 11:23
 */
/*
字符串的工具类
    优先采用静态方法

判断字符串是否为空

 工具类：（掌握）
	1. 概念：就是类中只有（静态、非静态）方法，就是为了调用方法。
	2. 作用：就是一个轮子
	3. 分类：
		1. 静态的
			方法全部都是static修饰的，调用方式：类名.方法名(...);

		2. 非静态的
			通过单例模式获取到对象后。就是只有一个对象的类
			方法全部都是非static修饰的，调用方式：对象名.方法名(...);

	4. 工具类命名：
		XxxUtil、XxxUtils、XxxTool、XxxTools
 */
public class StringUtil {
    public static boolean isNull(String str){
        if(str==null || str.equals("")){
            return true; //当字符串为空 或者空 字符串 的时候，返回true
        }
        return false;
    }
}
