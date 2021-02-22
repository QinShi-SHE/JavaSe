package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FuValue
 * @Date 2021/1/3 15:06
 */
public class FuValue {
    public static void main(String[] args) {
        /*
                赋值运算符的符号：
	                =   +=   -=   *=   /=   %=
                注意
                    a+=1与a=a+1区别
                        +=存在隐式转换
         */

        int a=10;
        a+=10; //可以理解成a=a+10=20
        System.out.println(a);
        a-=5;  //a=a-5=15
        System.out.println(a);
        a*=2;  //a=a*2=30
        System.out.println(a);
        a/=3;
        System.out.println(a);
        a%=2;
        System.out.println(a);

        //b+=1 与 b=b+1 区别
        byte b=1;
        b+=1; //数据类型默认提升到最高类型，存在隐式转换
        System.out.println(b);

        //b=b+1; //报错，1是int类型
        b= (byte) (b+1); //需要强制转换
        System.out.println(b);
    }
}
