package qinshi.day7;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ErFenSeek
 * @Date 2021/1/8 11:28
 */
public class ErFenSeek {
    /*
       二分查找：了为找到元素在数组中的哪一个位置上
          前提：该数组中的数据一定要是有序的
          思路：
              将数组一分为二，找到中间下标，以中间下标为界限，左右两边看成一个独立的数组
              将要找的数字和中间下标对应的数字进行比较，如果查找的这个值大于中间下标的值，说明要查找的这个值在中间元素的右边，否则在左边
              将找到的哪一边，重新一分为二，再来比较查找
     */
    public static void main(String[] args) {
        int[] arry={2,23,55,65,76,86,98};
        //定义查找的数
        int num=76;
        //定义三个变量，最大、最小、中间下标
        int maxIndex=arry.length-1;
        int minIndex=0;
        int centerIndex=(maxIndex+minIndex)/2;

        while (true){  //不知道循环次数
            if(num==arry[centerIndex]){  //如果找到，跳出
                System.out.println(centerIndex);
                break;
            }else if(num>arry[centerIndex]){  //如果右边大，最小值等于中间坐标+1
                minIndex=centerIndex+1;
            }else {                           //如果左边大，最大值等于中间坐标-1
                maxIndex=centerIndex-1;
            }
            centerIndex=(maxIndex+minIndex)/2; //再次计算中间坐标
        }

    }
}
