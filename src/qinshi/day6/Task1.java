package qinshi.day6;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/5 19:59
 * 定义一个整型数组，求出数组元素的和、数组元素的最大值和最小值，并输出所求的结果
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arry={6,2,9,44,9};
        int min=arry[0],max=arry[0],sum=0;
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
