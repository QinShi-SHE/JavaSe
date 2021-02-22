package qinshi.day24.lambda_2;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LambdaTest
 * @Date 2021/2/2 10:25
 */
/*
lambda：【重点】
	1. 概念：就是对函数式接口匿名内部类的简写
	2. 作用：简化代码
	3. 使用：
		语法：
			函数式接口  变量名 = (参数1，参数2...) -> {
                  //方法体
         	}
			(参数1，参数2…)表示参数列表；
			->表示连接符；连接符号后是方法体
			{}内部是方法体
		特点说明：
			普通方法的写法
			1、=右边的类型会根据左边的函数式接口类型自动推断；
			2、如果形参列表为空，只需保留()；
			3、如果形参只有1个，()可以省略，只需要参数的名称即可；
			4、如果执行语句只有1句，且无返回值，{}可以省略，
				若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句；
			5、形参列表的数据类型会自动推断；
			6、lambda不会生成一个单独的内部类文件；
			7、lambda表达式若访问了局部变量，则局部变量必须是final的，
			若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；
 */
public class LambdaTest {
    @Test
    public void test() throws Exception{
          //匿名内部类方法
//        Usb usb=new Usb() {
//            @Override
//            public void show1() {
//                System.out.println("无参无返");
//            }
//        };
//        usb.show1();

        //第一种方式
        Usb usb2=() ->{
            System.out.println("这是无参无返的lambda表达式1");
        };
        usb2.show1();

        /*
            第二种简化方式
                1.如果形参列表为空，只需保留()；
                2.如果执行语句只有1句，且无返回值，{}可以省略，
				    若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句；
         */
        Usb usb3=() -> System.out.println("这是无参无返的lambda表达式2");
        usb3.show1();

        //无参有反,只有一句执行语句
        Usb2 usb4=() -> 4;  //若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句；
        System.out.println("这是无参有返回值，且执行语句只有一句:"+usb4.show2());

        //有参无返，只有一句执行语句
        Usb3 usb5= a -> System.out.println("有一个参数，没有返回值:"+a);  //如果形参只有1个，()可以省略，只需要参数的名称即可；
        usb5.show3(4);

        //有两个参数，有返回值
        Usb4 usb6=(a, b) -> a+b;
        System.out.println("这是有两个参数有返回值，且执行语句只有一句:"+usb6.show4(1,4));
    }
}
