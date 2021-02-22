package qinshi.day7;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task6
 * @Date 2021/1/8 11:21
 */
public class Task6 {
    /*
        移除数组int[] arr = {1,2,3,4,5,1,9,4,12,67,1};中1这个元素，
        返回一个新的数组 （不带有1）；即新数组为int[] arr2 ={2,3,4,5,9,4,12,67};
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,9,4,12,67,1};
        int[] arr2=new int[8];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=1){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int x : arr2){
            System.out.print(x+"\t");
        }
    }
}
