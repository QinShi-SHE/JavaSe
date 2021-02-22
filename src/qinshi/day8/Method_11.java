package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_11
 * @Date 2021/1/9 15:25
 */
public class Method_11 {
    /*
        在使用方法的时候，传入值或者变量，传递的到底是什么？

        方法的参数传递：
                    基本数据类型传递的是值本身。
                    引用数据类型传递的是变量在堆中的引用地址。

         方法调用时，实际参数把它的值传递给对应的形式参数，相当于拷贝了一份值给形式参数，所以方法执行中形式参数值的改变不影响实际参数的值。
            (1)	基本数据不影响原来的值
            (2)	引用数据不影响原来的地址值，值可能会改变
     */

    public static void change(int a) {  //重载
        System.out.println("没有重新赋值之前的值:"+a);
        a = 1;
        System.out.println("重新赋值之后的值:"+a);
        System.out.println();
    }

    public static void change(int[] num) {  //重载
        System.out.println("没有重新赋值之前的值:"+num[0]);
        num[0] =2;
        System.out.println("重新赋值之后的值:"+num[0]);
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 10;
        int[] num = {20};

        System.out.println("在调用方法之前输出的基本数据类型的值:"+a);       //10
        System.out.println("在调用方法之前输出的引用数据类型的值:"+num[0]);  //20
        System.out.println();

        //调用方法：
        change(a);
        change(num);

        System.out.println("在调用方法之后输出的基本数据类型的值:"+a);        // 还是mian方法中定义的a值  10
        System.out.println("在调用方法之后输出的引用数据类型的值:"+num[0]);   // 注意！！这里是自定义方法中赋的值 2,  而非main方法中定义的20
    }
}
