package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/6 15:04
 */
public class Task2 {
    public static void main(String[] args) {
        //1.请打印出int[] arr = {1,9,96,9,6,66}; 数组中最小的一个数(低级)
        //2.请将int[] arr = {1,9,96,9,6,66};数组中所有的元素乘积打印出来(低级)
        int[] arr = {1,9,96,9,6,66};
        int min=arr[0],cj=1;
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            cj*=arr[i];
        }
        System.out.println("min="+min);
        System.out.println("乘积："+cj);

        //3.int[] arr = {1,2,3,4,5,6,7,8,9,11,12}求出其中的奇数和以及偶数和(低级)
        int[] arr2 = {1,2,3,4,5,6,7,8,9,11,12};
        int sumJ=0;
        int sumO=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]%2==0){
                sumO+=arr2[i];
            }else {
                sumJ+=arr2[i];
            }
        }
        System.out.println("偶数和："+sumO);
        System.out.println("奇数和："+sumJ);
    }
}
