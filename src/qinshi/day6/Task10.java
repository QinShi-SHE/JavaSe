package qinshi.day6;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task10
 * @Date 2021/1/6 18:41
 */
public class Task10 {
    public static void main(String[] args) {
        /*
            现在给出两个数组
             数组arr1: “1,7,9,11,13,15,17,19”;
             数组arr2:”2,4,6,8,10”
            两个数组合并之后数组arr，在按照排列返回排序和合并后的数组;
         */

        int[] arr1={1,7,9,11,13,15,17,19};
        int[] arr2={2,4,6,8,10};
        int[] arr=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr[arr1.length+i]=arr2[i];
        }
//        for (int i: arr){
//            System.out.print(i+"\t");
//        }
        System.out.println("\n"+Arrays.toString(arr));

        //排序
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
