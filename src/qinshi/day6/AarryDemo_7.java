package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_7
 * @Date 2021/1/6 14:34
 */
public class AarryDemo_7 {
    /*
           数组中常见的异常
                1.数组下标越界  ArrayIndexOutOfBoundsException
                2.空指针  NullPointerException
            最大小标：长度-1
            最小为0
     */
    public static void main(String[] args) {
        int[] arry=new int[2];
        arry[0]=1;
        arry[1]=2;
        //arry[2]=3;  //报错，超出范围
        //System.out.println(arry[3]);  //报错，下表没有3

        int[] a=new int[2];
        a[0]=2;
        a[1]=4;
        //a=null; //把数组赋值为空对象
        System.out.println(a[0]); //报错，a被赋值为空
    }
}
