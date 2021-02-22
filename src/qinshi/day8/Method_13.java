package qinshi.day8;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Method_13
 * @Date 2021/1/9 16:48
 */
public class Method_13 {
    /**
        数组工具类的使用：
                    有无static修饰   有static修饰的情况下 采用类名.方法名调用
                    有无返回值
                    有无参数

        Arrays工具类： 此类包含用来操作数组（比如排序和搜索）的各种方法

     注意返回值

     static int binarySearch(int[] a, int key)    返回int类型的值
     使用二分搜索法来搜索指定的 int 型数组，以获得指定的值。
     参数：
     a - 要搜索的数组
     key - 要搜索的值
     返回：
     如果它包含在数组中，则返回搜索键的索引；否则返回负数(表示没有找到)。

     static void sort(int[] a)                   返回为空
     对指定的 int 型数组按数字升序进行排序。

     static String toString(int[] a)            返回字符串类型
     返回指定数组内容的字符串表示形式。

     static int[] copyOf(int[] original, int newLength)         返回数组类型
     复制指定的数组，截取或用 0 填充（如有必要），以使副本具有指定的长度。
     */

    public static void main(String[] args) {
        int[] a = {122,32,44,25,34,52,223,4};
        int key = 122;

        //先将数组中的数据进行排序
        Arrays.sort(a);

        //将排序后的数组打印出来
        System.out.println(Arrays.toString(a));

        //调用二分查找的方法，来查找指定的值在数组中的索引位置
        int index = Arrays.binarySearch(a, key);
        System.out.println(index);

        //复制一个数组出来
        int[] b = Arrays.copyOf(a, 6);
        System.out.println(Arrays.toString(b));

        int[] c=Arrays.copyOf(b,0);
        System.out.println(Arrays.toString(c));
    }
}
