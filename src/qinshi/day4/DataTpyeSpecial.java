package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DataTpyeSpecial
 * @Date 2021/1/3 10:48
 */
public class DataTpyeSpecial {
    public static void main(String[] args) {
        /*
            特例：
                boolean,char

            boolean类型不能和任何数据类型转换，不管是自动还是强制

            byte和char之间不能自动转换，因为byte的取值有负数，而char没有，不能自动转换
                但char和byte能强制转换

            char和short不能自动转换，因为它们取值范围不一样
                但能强转
        */

        // boolean a =true;
        //byte b=a;

        char c=65;  //数字会转换对应的ASCII
        byte d = (byte) c;
        System.out.println(d);

        short e = 666;
        char e2 = (char) e;
        char e3 = 555;
        System.out.println(e2);
        System.out.println(e3);
    }
}
