package qinshi.day6;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AarryDemo_6
 * @Date 2021/1/6 14:18
 */
public class AarryDemo_6 {
    /*
        数组的长度一旦定义好以后，不能被修改
            new 一定会新建一个数组
        要修改必须重新创建一个新的数组，将该数组的地址值重新赋值
     */
    public static void main(String[] args) {
        int[] a=new int[3];
        System.out.println(a.length);
        System.out.println(a);

        a=new int[5]; //创建一个新数组
        System.out.println(a.length);
        System.out.println(a); //地址重新赋值

        int[] b=new int[5];
        b[0]=1;
        System.out.println(b[0]);
        b=new int[3];  //重新的数组
        b[2]=2;
        System.out.println(b[0]);  //b[0] 未赋值，int默认为0
        System.out.println(b[2]);

    }
}
