package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_12
 * @Date 2021/1/6 16:18
 */
public class AarryDemo_12 {
    /*
            按照某种格式打印数组元素，数组元素放在方括号[]中,相邻元素使用逗号分隔开。
            如上述数组打印 出来，效果如：[11, 22, 33, 44, 22, 55]
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 11, 22, 33, 44, 22, 55 };
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
