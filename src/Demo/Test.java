package Demo;

import java.util.Arrays;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/22 19:29
 */
public class Test {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            a=i;
        }
        int[] arr=new int[4];
        arr[0]=11;
        arr[1]=21;
        arr[2]=31;
        arr[3]=41;
        Arrays.toString(arr);
        int d=eat();
        System.out.println(d);
    }

    public static  int eat(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        return 10;
    }
}
