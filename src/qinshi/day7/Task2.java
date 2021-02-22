package qinshi.day7;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/8 9:28
 */
public class Task2 {
    void getSum(){
        //int[] arr = {1,2,3,4,5,6,7,8,9,11,12}求出其中的奇数和以及偶数和(低级)
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
    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.getSum();
    }
}
