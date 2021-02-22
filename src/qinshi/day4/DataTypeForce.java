package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DataTypeForce
 * @Date 2021/1/3 10:30
 */
public class DataTypeForce {
    public static void main(String[] args) {
        /*
            强制类型转换：从大到小，大数据类型转小数据类型
                byte(8bit),short(16bit),int(32bit),long(64bit),float(32bit),double(64bit)
            强转语法：
                要转的数据类型 变量名 = (要转的数据类型) 变量名
            注意：
                1. 	高转低会导致精度丢失,不同类型的强制转换，可能会导致精度的下降.
                2. 	实际开发中:应该要知道被强制转换的数据,是在一个已知的范围;
            强转意义：
                节约内存空间
        */

        int a = 160;
        int a2 = 127;
        byte b = (byte) a;  //装不下，数据丢失
        byte b2 = (byte) a2;
        //byte b3= a2;  //127,装得下，不加强转会报错，因为编译只看类型,不看具体的值
        System.out.println(b);
        System.out.println(b2);

        double c = 6.96;
        int d = (int) c;
        System.out.println(d);
    }
}
