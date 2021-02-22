package qinshi.day9;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task1
 * @Date 2021/1/10 19:33
 */
public class Task1 {
    public static void main(String[] args) {
        //1判断成绩是否满足要求。当成绩等于100时，奖励一个娃娃，否则就奖励两个娃娃。
        int grade=110; //成绩
        System.out.println(grade==100?"奖励一个娃娃":"奖励两个娃娃");

        //while
        int sum1=0;
        int sum2=0;
        int num=1;
        while (num<11){
            if(num%2==0){
                sum1+=num;
            }else {
                sum2+=num;
            }
            num++;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        //do-while
        sum1=0;
        sum2=0;
        num=1;
        do{
            if(num%2==0){
                sum1+=num;
            }else {
                sum2+=num;
            }
            num++;
        }while (num<11);
        System.out.println(sum1);
        System.out.println(sum2);
        //for
        sum1=0;
        sum2=0;
        for (int i=1;i<11;i++){
            if(i%2==0){
                sum1+=i;
            }else {
                sum2+=i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        //使用任意类型定义一个数组，赋予初始值，遍历数组中所有的元素。请使用两种方式来分别实现。
        int[] arr={1,2,3,4};
        //普通for遍历
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        //增强for
        for(int i : arr){
            System.out.print(arr[i]);
        }
    }
}
