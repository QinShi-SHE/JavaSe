package qinshi.day16.work;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName ChangeSum
 * @Date 2021/1/21 18:57
 */
public class ChangeSum {
    /*
        设计一个求和方法，接收参数使用可变参数

        方法的可变参数:
                       方法的形式参数，表示该种类型的参数个数不确定，可以表示0个或者多个该类型的参数；
                      （数组也可以为零个）

            数据类型...参数名
            如: int...param

            注：可变参数从本质上来来说还是一个数组
            int...param等价于int[] param

            可变参数只能在最后一位
            可变参数在形参列表中只能有一个，且只能在最后一位
     */

    void getSum(int...x){
        int sum=0;
        //foreach遍历
        for (int i:x){
            sum+=i;
        }
        //普通for循环遍历
//        for (int i=0;i<x.length;i++){
//            sum+=x[i]; //注意这里是x[i],相对于数组
//        }
//        System.out.println(sum);
    }

    public static void main(String[] args) {
        new ChangeSum().getSum(1,2,3,4);
    }
}
