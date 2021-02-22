package qinshi.day8;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_10
 * @Date 2021/1/9 15:25
 */
public class Method_10 {
    /*
         定义一个方法，求多个整数和
     */

    //定义一个方法，参数为数组
    public static void getSum(int[] num) {
        //定义一个变量 接收和
        int sum = 0;
        for (int i : num) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        getSum(new int[]{1,2,3,4});

        int[] arr={3,4,5,6};
        getSum(arr);
    }
}
