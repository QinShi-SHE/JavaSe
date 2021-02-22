package qinshi.day14.integer_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName IntegerTest2
 * @Date 2021/1/18 11:31
 */
/*
    基本数据类型和对应的包装类
    装箱：基本数据类型转包装类
        自动
            Integer i=134;
        手动
            Integer i2=new Integer(134);
    拆箱：包装类转基本数据类型
        自动
            int i1=i; (i是Integer)
        手动
            int i3=i2.intValue();
 */
public class IntegerTest2 {
    public static void main(String[] args) {
        //自动拆装
        Integer i=134;
        int i1=i; //(i是Integer)
        System.out.println(i1);

        //手动
        Integer i2=new Integer(134);
        int i3=i2.intValue();
        System.out.println(i3);

        //将Integer转换为double类型,自动不行，手动可以
        double d=i2.doubleValue();
        System.out.println(d);

    }
}
