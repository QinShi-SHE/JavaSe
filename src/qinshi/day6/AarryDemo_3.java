package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_3
 * @Date 2021/1/6 11:22
 */
public class AarryDemo_3 {
    /*
        静态初始化：
            程序员直接为每一个数组元素设置初始化值，而数组的长度由系统(JVM)决定。
            语法：数组元素类型[] 数组名 = new 数组元素类型[]{元素 1,元素 2,元素 3,.......};
                    int[] nums = new int[]{1,3,5,7,9};
                简单写法:
                     int[] nums = {1,3,5,7,9};//简单写法,
     */
    public static void main(String[] args) {
        // 静态初始化；
        //定义初始化数组（创建数组） new 是创建
        int[] arr1 = new int[]{1,2,3,4,5}; //不常用的写法
        int[] arr2 = {6,7,8,9,0};  //简单写法
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr2[0]);

        //定义并初始化数组
        int[] nums = new int[] { 1, 3, 5, 7 };
        System.out.println("数组长度=" + nums.length);
        //重新初始化数组
        nums = new int[] { 2, 4, 8 };
        System.out.println("数组长度=" + nums.length);
    }
}
