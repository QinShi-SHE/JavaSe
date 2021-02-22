package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName DadaTaypeAuto
 * @Date 2021/1/3 10:22
 */
public class DataTypeAuto {
    public static void main(String[] args) {
        /*
            自动类型转换：从小到大
                byte(8bit),short(16bit),int(32bit),long(64bit),float(32bit),double(64bit)
            float为什么比long大，因为底层运算方式不一样
        */

        byte a1=127;
        short b1=a1;
        int c1=a1;
        long d1=c1;
        float e1=c1;
        double f1=e1;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);

        //1.如果2个操作数（包括byte，short，char，int），都将会转换为int类型，且结果也为int（自动向上转型）
        short s = 10;
        byte num = 20;
        //short n1 = num + s; //会报错,byte+short自动转为了整型，要么强转要么用int接收
        int n= num + s;
        System.out.println(n);

        //2.long  float  double只要两个操作数中有一个为以上类型，另一个就会被转换成相应类型，并且结果也为该类型
        int c=1;
        long d=2L;
        double e=6.4D; //或double =6.4
        //如果c+d+e，必须要用最高类型来接收
        double ee=c+d+e;
        //int ee3=c+d+e;  //报错，要么最高类型接收，要么强转
        //float ee4=c+d+e;  //报错，要么最高类型接收，要么强转
        System.out.println(ee);

        //3.char类型向更高长度类型（例如整型）转换时，会转换为对应的ASCII码值，再做其他类型的自动转换
        char ch='a'; //a对应ASCII值97
        int x=ch+10;
        System.out.println(x); //97+10=107
    }
}
