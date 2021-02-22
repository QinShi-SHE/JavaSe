package qinshi.day7;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Aarry_2
 * @Date 2021/1/8 15:07
 */
public class Aarry_2 {
    /*
        遍历二维数组:
            双重for循环
     */
    public static void main(String[] args) {
        int[][] arr={{1,2,4},{6,5,3}};


        //普通for循环
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

        //增强for循环
        for(int[] i: arr){
            for (int j:i){
                System.out.print(j+"\t");
            }
        }
    }
}
