package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Variable_1
 * @Date 2021/1/2 22:15
 */

/*
    变量：
        变量是内存中的一个存储区域，该区域有自己的名称（变量名）和类型（数据类型）
        Java中每个变量必须先声明，后使用， 该区域的数据可以在同一类型范围内不断变化。
*/
public class Variable_1 {
    public static void main(String[] args) {
        //1.先定义，在赋值
        int a;
        a=1;
        System.out.println(a);

        //2.定义时同时赋值
        int b=2;
        System.out.println(b);

        //3.一次声明多种同类型的变量
        int c=3,d=4,e=5;
        System.out.println(c+"\n"+d+"\n"+e);
    }
}
