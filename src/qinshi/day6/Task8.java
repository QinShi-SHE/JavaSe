package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task8
 * @Date 2021/1/6 18:18
 */
public class Task8 {
    public static void main(String[] args) {
        /*
        已知数组：int[] arr = {1,9,96,9,6,66}; （高级）
        现有新数组：int[] newArr = new int[4];
        请将数组arr从第2个元素开始的4个元素复制到新数组newArr中。（即复制：9,96,9,6 到新数组newArr中）
         */
        int[] arr = {1,9,96,9,6,66};
        int[] newArr = new int[4];
        for(int i=1;i<arr.length-1;i++){
            newArr[i-1]=arr[i];
        }
        for(int i : newArr){
            System.out.println(i);
        }
    }
}
