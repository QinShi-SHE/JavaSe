package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Count
 * @Date 2021/1/11 17:33
 */
public class Count {
    /*
        计算类：
        方法1：可以接收一个数值，并且算出该数值的平方，然后打印结果
        方法2：可以接收2个数值，并且相比较，最后返回较大的数值出去

        计算类:
        方法1：接收一个整数，并且返回该整数+1`
        方法2：接收一个整数，并且返回该整数的平方
     */

    void getValue(int a){
        System.out.println(a+"的平方为"+a*a);
    }

    int getValue(int a,int b){
        return a>b?a:b;
    }

    int getInt(int a){
        return a+1;
    }

    int getInt2(int b){
        return  b*b;
    }
}
