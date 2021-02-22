package qinshi.day6;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Aarry
 * @Date 2021/1/5 19:21
 */
public class AarryDemo_1 {
    /*
        声明数组方法
            dataType[] arrayRefVar;   // 首选的方法
            数据类型[]  数组名

            dataType arrayRefVar[];  // 效果相同，但不是首选方法
     */
    public static void main(String[] args) {

        //声明(定义)数组两种方法

        //第一种
        double[] d1;  //首选
        int[] a1;

        //第二种定义
        String d2[];  //定义字符串类型的数组


        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);

    }
}
