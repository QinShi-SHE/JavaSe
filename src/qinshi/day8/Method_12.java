package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_12
 * @Date 2021/1/9 15:50
 */
public class Method_12 {
    /*
           方法的可变参数:
                       方法的形式参数，表示该种类型的参数个数不确定，可以表示0个或者多个该类型的参数；
                      （数组也可以为零个）

            数据类型...参数名
            如: int...param

            注：可变参数从本质上来来说还是一个数组
            int...param等价于int[] param

            可变参数只能在最后一位
            可变参数在形参列表中只能有一个，且只能在最后一位

            可变参数比方法重载简单，虽然可以0个或者多个，但是类型必须相同
     */

    //求多个整数的和
   static void getSum(int...m){
        int sum=0;
        for (int i: m){
            sum+=i;
        }
        System.out.println(sum);
    }

    static void getSum2(String x,int...m){
        int sum=0;
        for (int i: m){
            sum+=i;
        }
        System.out.println(sum+x);
    }

    public static void main(String[] args) {
        getSum(); //0个参数
        getSum(1,2);  //2个参数
        getSum(1,2,3);  //3个参数

        getSum2("1",1);
        getSum2("sd");
    }
}
