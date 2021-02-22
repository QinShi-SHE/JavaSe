package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_5
 * @Date 2021/1/6 14:14
 */
public class AarryDemo_5 {
    /*
           数组的默认值
             整型      0
             浮点型    0.0
             字符型    空
             布尔型    false
             引用类型
                String   默认为null(空对象)
     */
    public static void main(String[] args) {
        int[] arr1=new int[4];
        System.out.println(arr1[1]);

        String[] arr2=new String[2];
        System.out.println(arr2[0]);
    }
}
