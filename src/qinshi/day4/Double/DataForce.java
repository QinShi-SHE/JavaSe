package qinshi.day4.Double;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName DataForce
 * @Date 2021/1/4 15:24
 */
public class DataForce {
/*
强制类型转换
1. 条件是转换的数据类型必须是兼容的。
2. 格式：(type)value type是要强制类型转换后的数据类型

隐含强制类型转换
1. 整数的默认类型是 int。
2. 浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f。
 */
    public static void main(String[] args) {
        int i1 = 123;
        byte b = (byte)i1;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
    }
}
