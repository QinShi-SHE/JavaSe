package qinshi.day24.lambda_2;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Usb
 * @Date 2021/2/2 10:21
 */
/*
Lambda表达式
    前提：该接口必须是函数式接口，且有且仅有一个抽象方法
作用：
    为了简化匿名内部类的写法

定义四方抽象法
    1.无参无返
    2.无参有反
    3.有参无返
    4.有参有反
 */
public interface Usb {
    public void show1();      //函数式接口，且有且仅有一个抽象方法
//    public int show2();
//    public void show3(int a);
//    public int show4(int a,int b);
}
