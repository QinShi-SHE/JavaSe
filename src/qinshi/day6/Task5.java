package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task5
 * @Date 2021/1/6 16:42
 */
public class Task5 {
    public static void main(String[] args) {
        //定义一个数组int[] nums={8,7,3,9,5,4,1}，输出数组中的最大值和最大值所在的下标
        int[] nums={8,7,3,9,5,4,1};
        int max=nums[0];
        int id=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                id=i;
            }
        }
        System.out.println("max="+max);
        System.out.println("下标:"+id);
    }
}
