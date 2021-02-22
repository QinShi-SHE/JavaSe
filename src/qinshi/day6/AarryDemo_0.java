package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_0
 * @Date 2021/1/11 13:41
 */
public class AarryDemo_0 {
    /*
            动态初始化：数组定义与为数组分配空间和赋值的操作分开进行；
            静态初始化：在定义数字的同时就为数组元素分配空间并赋值；
            默认初始化：数组是引用类型，它的元素相当于类的成员变量，因此数组分配空间后，每个元素也被按照成员变量的规则被隐式初始化。
     */
    public static void main(String[] args) {
        //动态初始化
        int[] a;//int a[];两者都可以
        a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        //静态初始化
        int[] b = {0, 1, 2};//int b[] = {0, 1, 2};两者都可以
        //默认初始化
        int[] c = new int[10];//int c[] = new int[10];两者都可以
    }
}
