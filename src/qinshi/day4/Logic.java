package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Logic
 * @Date 2021/1/3 15:28
 */
public class Logic {
    public static void main(String[] args) {
        /*
                逻辑运算符
                    &&   并且    同真则真，遇假则假
                    ||    或者    同假则假  遇真则真
                    ！      取反
                用来连接布尔类型的两个值或表达式，最终结果也位布尔类型
                结果： boolean类型，true 或 flase

                & 和 && 区别：
                        相同：
                            都可以判断真假，都是表示并且的意思，要同时为真才为真
                        不同：
                            $$具有短路功能
                                当整个表达式中的第一个条件会flase时，后面的算式就不用计算了，因为发生了短路
                                当整个表达式中的第一个条件为true的时候,后面的正常执行

                            & 不具有短路功能


                 | 和 || 区别：
                        相同：
                            都可以来判断真假，都是表示或者的意思  要同时为假才为假
                        不同：
                             || 具有短路的功能
                                当整个表达式中的第一个条件为true的时候，后面的算式就不用计算了，因为发生了短路
                                当整个表达式中的第一个条件为false的时候,后面的正常执行、

                             |  不具有短路功能
         */
        System.out.println(1>2 && 2>1);
        System.out.println(1>2 || 2>1);

        System.out.println(true || false);
        System.out.println(true && false);
        System.out.println(! false);

        //验证%%短路的功能
            //当表达式中的第一个条件会flase时，后面的算式就不用计算了，因为发生了短路功能
        int e = 10;
        //System.out.println(e>5 && ++e>10); //true
        System.out.println(e<5 && ++e>10); //flase
        System.out.println(e); //只要前面第一个条件为假，后面第二条件就不会再执行

        // & 不会发生短路
        int f =10;
        System.out.println(f<5 & ++f>10); //flase
        System.out.println(f);


        //验证||短路的功能
        int x=10;
        //System.out.println(x<5 || ++x>10); //true
        System.out.println(x>5 || ++x>10); //true
        System.out.println("x="+x); //x=10,只要前面第一个条件为真，后面第二条就不会再执行

        // | 不会发生短路
        int y=10;
        System.out.println(y>5 | ++y>10);
        System.out.println("Y="+y); //y=11
    }
}
