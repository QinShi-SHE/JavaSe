package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_9
 * @Date 2021/1/6 15:17
 */
public class AarryDemo_9 {
    public static void main(String[] args) {
        //1：找出数组中元素 23 第一次出现的索引位置  从左往右找
        int[] arry={1,2,23,55,6,4,6,23,213,3};
//        for(int i=0;i<arry.length;i++){
//            if (arry[i]==23){
//                System.out.println("23第一次出现的位置："+i);
//                break; //结束循环
//            }
//        }

        //找最后一次出现23的索引位置   从右往左找
        for (int i=arry.length-1;i>0;i--){
            if(arry[i]==23){
                System.out.println("23最后一次出现的位置："+i);
                break; //结束循环
            }
            System.out.println(i);
        }
    }
}
