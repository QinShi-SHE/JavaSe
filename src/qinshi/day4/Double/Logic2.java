package qinshi.day4.Double;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Logic
 * @Date 2021/1/4 14:30
 */
/*
&&	称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
| |	称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
！	称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。
 */
public class Logic2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        //短路功能

        //当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
        int a1 = 5;//定义一个变量；
        boolean b1 = (a1<4) && (a1++<10);
        /*
        该程序使用到了短路逻辑运算符(&&)，首先判断 a<4 的结果为 false，
        则 b 的结果必定是 false，所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5。
         */
        System.out.println("a1="+a1); //a1=5
        //但是 & 没有短路功能
        int a11 = 5;
        boolean b11 = (a11<4)&(a11++<10);
        System.out.println("a11="+a11); //a11=6

        //当使用逻辑或运算符时，只要一个为真，结果就为真；在两个数操作中，当第一操作为true时，就不会在判断第二个操作了
        int a2 =5;
        boolean b2=(a2>4 || a2++<10); //true
        System.out.println("a2="+a2); //a2=5;
        //但是 | 没有短路功能
        int a22 =5;
        boolean b22=(a22>4 | a22++<10); //true
        System.out.println("a22="+a22); //a2=6;
    }
}
