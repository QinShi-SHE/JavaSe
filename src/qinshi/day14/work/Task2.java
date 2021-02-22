package qinshi.day14.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Task2
 * @Date 2021/1/18 15:32
 */
public class Task2 {
    public static void main(String[] args) {
        /*
            int  转  Integer   new Integer(10);
            Integer 转 int
           int  转  String
           String 转 int
           Integer 转  String
            String  转  Integer
         */

        //int转Integer
        Integer i=1234;  //自动装箱
        System.out.println(i);

        //Integer转int
        int i1=i;  //自动拆箱
        System.out.println(i1);

        //int转String
        String s= String.valueOf(i1);
        System.out.println(s);

        //String转int
        int i2= Integer.parseInt(s);
        System.out.println(i2);

        //Integer转String
        String s2= String.valueOf(i);
        System.out.println(s2);

        //String转Integer
        Integer integer= Integer.valueOf(s2);
        System.out.println(integer);
    }
}
