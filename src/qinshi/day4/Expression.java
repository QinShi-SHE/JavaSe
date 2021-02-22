package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Expression
 * @Date 2021/1/3 11:29
 */
public class Expression {
    public static void main(String[] args) {
        /*
            表达式目的：
                知道整个表达式中的最终数据类型
                表达式的最终类型有表达式中的最高数据类型为准
        */

        //byte a2 = 129;
        byte a = (byte) (127+2); //直接写 byte a= 127+2,会报错,需要整型强转byte型
        System.out.println(a); //127+2=129,但结果是-127，因为byte最大127,精度丢失

        //short b2 = a+12; //如果用short会报错,因为12为整数默认为Int ( 表达式的最终类型有表达式中的最高数据类型为准)
        short b3 = (short) (a+12);  //如果要用，必须强转，int转short
        int b = a+12; //a是byte,12为int ,表达式中最高为int 所以用int 接收没错


        //有字符类型 先转换为对应的ascii码表的值，然后才参与运算
        System.out.println(10+13.14+'a');

    }
}
