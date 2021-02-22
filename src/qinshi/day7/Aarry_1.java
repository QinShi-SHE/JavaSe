package qinshi.day7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Aarry_1
 * @Date 2021/1/8 8:55
 */
public class Aarry_1 {
    /*
        二维数组：
                 二维数组可以看作是一维数组中的元素为一维数组，声明方式和一维数组类型，把一维数组看作一个整体的数据类型
          声明：
            静态
               数据类型[] []  数组名= {{元素1,元素2},{元素3,元素4};
            动态
              数据类型[] []   数组名 =  new 数据类型 [长度][长度];

     */
    public static void main(String[] args) {
        //静态
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[1][2]);

        //动态
        int[][] arr2=new int[3][3];
        arr2[0][0]=1;
        arr2[0][1]=2;
        arr2[2][2]=9;
        System.out.println(arr2[2][2]);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2+"\n");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}
