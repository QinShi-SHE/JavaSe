package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_11
 * @Date 2021/1/6 16:16
 */
public class AarryDemo_11 {
    public static void main(String[] args) {
        //静态创建的数组
        int[] arr = {1,42,35,443,21,465,456,21,345};
        /*
         * 求所有元素之和
         * 思路：
         * 		1、创建一个数组，并赋予初始值
         * 		2、采用循环遍历数组中的每一个元素
         * 		3、定义一个变量，用于相加的和，遍历一个加一个
         * 		4、输出这个变量
         */
        //定义一个变量 用于装和
        int sum = 0;
        //定义一个变量 用于存放平均数
        int avg;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
