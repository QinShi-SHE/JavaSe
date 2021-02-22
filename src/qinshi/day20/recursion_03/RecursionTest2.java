package qinshi.day20.recursion_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName RecursionTest
 * @Date 2021/1/27 16:17
 */
/*
递归 是一种算法 在满足条件的情况下 自己调用自己
注意：递归一定要有出口，否则会造成栈内存溢出

解决：由层级关系的数据结构
作用：简化有相似的业务逻辑（循环）代码

斐波拉契数列问题(兔子数列)
1(第一项)  1(第一项)  2(第一项)  3  5  8  13  21
从第三项开始，每一项的数字等于前两项之和
 通过一个斐波拉契数列,学习方法的递归调用
	 * f(1) = 1;
	 * f(2) = 1;
	 * f(n) =  f(n-1) + f(n-2)  n>=2;

	 n=92,最大值为92，如果比92还大，就超过了long的最大值
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        System.out.println(f(80));
    }
    static long f(int n){
        if(n==1 || n==2){
            return 1;
        }
        else {
            return f(n-1)+f(n-2);
        }
    }
}
