package qinshi.day3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DoubleTaype_1
 * @Date 2021/1/2 23:28
 */
public class DoubleTaype {
    public static void main(String[] args) {
        //浮点型默认为double类型，所以float类型的数字要加上f或者F
        float f1=3.14f;
        float f2=3.14F;

        double d1=1.21;

        System.out.println(f1);
        System.out.println(d1);

        System.out.println(10/3.0);//除不尽的情况，保留小数点后16位
        System.out.println(2.0-0.9);
        System.out.println(2.0+1.1);
        System.out.println(2.0-1.1);//个小数想相加或者相减的结果，是无限接近于这个数的
    }
}

