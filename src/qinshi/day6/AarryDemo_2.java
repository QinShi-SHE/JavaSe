package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_2
 * @Date 2021/1/6 10:41
 */
public class AarryDemo_2 {
    /*
    数组的初始化
            完整定义语法
            数据类型[] 数组名 = new(创建) 数据类型[数组的长度]

            数组在定义后，必须初始化才能使用。所谓初始化，就是在堆内存中给数组分配存储空间，并为每一 个元素赋上初始值，有两种方式：
                静态初始化；  创建的时候就赋值
                动态初始化； 先创建，后赋值
        无论以哪种，一旦初始化完成，数组的长度（元素的个数）就固定了，不能改变，除非重新对该初始化，也就是说数组是定长的。
        一般，如果我们事先知道元素是多少，选用静态初始化，事先不知道元素是多少，选用动态初始化。

        动态初始化：
            程序员只设置数组元素个数，而数组的元素的初始值由系统(JVM)决定。
            语法：数组元素类型[] 数组名 = new 数组元素类型[length];
            int[] nums = new int[5];
            不能同时指定元素值和数组长度，反例如下:
            int[] nums = new int[5]{1,3,5,7,9};

        不同数据类型的初始值：
            int[] arr1 = new int[3];
             int 类型数组，每一个元素的初始值为 0
            double[] arr2 = new double[5]; double 类型数组，每一个元素初始值为 0.0
            String[] arr3 = new String[2]; String 类型数组，每一个元素的初始值为 null
     */
    public static void main(String[] args) {

        //动态初始化； 先创建，后赋值
        //定义并初始化数组
        int[] nums2 = new int[4];
        nums2[0]=33;
        nums2[1]=31;
        nums2[2]=30; //会覆盖前面的值
        System.out.println(nums2[0]+nums2[1]);
        System.out.println("数组长度=" + nums2.length);
        //重新初始化数组
        nums2 = new int[5];
        System.out.println("数组长度=" + nums2.length);
    }
}
