package qinshi.day7;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MaoPao
 * @Date 2021/1/8 10:14
 */
public class MaoPaoSort {
    /*
            冒泡排序：
                通过对待排序的序列从前向后依次比较相邻元素的值，如果发现逆序则交换。
                逆序的含义：如果想把序列从小到大排序，那么两个数中前面的比后面的大就是逆序。
                若需求是将序列从小到大排序，那么每一趟比较都会把值较大的逐渐从前面移动到后面。
             排序方法：
                两两相比，小的在前，大的在后
                外层循环：n-1，n代表数组的长度           控制比较的次数
                外层循环：n-1-i，i是外层循环的变量        控制每次比较的次数
     */
    public static void bubbleSort(int[] arr) {
        /*
                如果一趟排序都没有发生交换，表示已经有序了，没必要进行接下来的排序了。
                可以定义一个 flag ，初始值为false，如果发生交换，就赋值为true，否则一直是false直接退出循环。
         */
        int temp;//用于交换的临时变量
        boolean flag = false;//表示是否进行交换
        for(int i=0;i<arr.length - 1;i++){
            for(int j = 0;j<arr.length - 1 - i ; j++){
                if(arr[j] > arr[j + 1]){  //这是从小打到，把>变成<就是从大到小
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                break;
            }else{
                flag = false;//将flag重新置为false
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        bubbleSort(new int[]{5,8,-2,20,-6});
    }
}
