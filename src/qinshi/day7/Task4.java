package qinshi.day7;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task4
 * @Date 2021/1/8 11:19
 */
public class Task4 {
    /*
           设计一个方法,翻转传入数组中的元素
           例如有这样的数组 char[] arr = {'源','代','码','教','育'};
           调用完上面的方法之后，arr中的内容是这样的{'育','教','码','代','源'};
     */

    String getArry(int[] arr){
        int temp;
        for(int i=0;i<arr.length/2;i++){  //两两交换，第一个和最后一个交换，只需要交换一半的数组
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
       Task4 task4=new Task4();
       System.out.println(task4.getArry(new int[]{1,2,3,4,5,6}));
    }
}
