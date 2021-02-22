package qinshi.day24.lambda_2;

import org.junit.Test;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName LambdaTest2
 * @Date 2021/2/2 11:50
 */
public class LambdaTest2 {
    int b=2; //全局变量

    @Test
    public void test() throws Exception{
        //lambda表达式若访问了局部变量，则局部变量必须是final的，
        //若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；

        //验证访问局部变量
        int a=1;  //如果接口访问了此变量，一定会被final修饰
        Usb usb=new Usb() {
            @Override
            public void show1() {
                //a=1; //会报错，因为a默认被final修饰 局部变量没有加final关键字，系统会自动添加
                System.out.println(a);

                b=3;  //全局变量可以
            }
        };
        usb.show1();
    }
}
