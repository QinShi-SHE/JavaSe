package qinshi.day14.string_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StringTestNull
 * @Date 2021/1/20 9:06
 */
public class StringTestNull {
    public static void main(String[] args) {
        String  str1 = null;              //表示str1没有指向一个对象    1
        String  str2 ="";                //有一个对象，对象是空         2
        String  str3 = new String();    //和②差不多                  3

        System.out.println(str1);  //打印null
        System.out.println(str2);  //空白
        System.out.println(str3);   //空白
        /*
        A.  理解到①表示没有对象
        B.  ②③有对象，但是是空的，没有字符，其实也没有多大意思
         */
    }
}
