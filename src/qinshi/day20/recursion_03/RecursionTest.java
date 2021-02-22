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
 */
public class RecursionTest {
    public static void main(String[] args) {
        getNum(1);
    }

    static void getNum(int num){
        System.out.println(num);
        num++;
        if(num<=10){
            getNum(num);  //方法本身中调用方法本身
        }
    }
}
