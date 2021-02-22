package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarrDemo_10
 * @Date 2021/1/6 15:41
 */
public class AarrDemo_10 {
    public static void main(String[] args) {
        //定义一个整型数组，求出数组元素的和、数组元素的最大值和最小值，并输出所求的结果
        int[] arry={6,2,9,44,9};
        int min=arry[0]; //把第一个数赋给最小值
        int max=arry[0]; //把第一个数赋给最大值
        int sum=0;
        for(int i=0;i<arry.length;i++){
            if(max<arry[i]){
                max=arry[i];
            }
            if(min>arry[i]){
                min=arry[i];
            }
            sum+=arry[i];
        }
        System.out.println("sum="+sum);
        System.out.println("max="+max);
        System.out.println(("min="+min));
    }
}
