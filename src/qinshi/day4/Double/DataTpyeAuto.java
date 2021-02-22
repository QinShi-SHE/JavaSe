package qinshi.day4.Double;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName DataTpyeAuto
 * @Date 2021/1/4 15:18
 */
public class DataTpyeAuto {
/*
    自动类型转换

转换从低级到高级。
低  ------------------------------------>  高
byte,short,char—> int —> long—> float —> double

数据类型转换必须满足如下规则：
1. 不能对boolean类型进行类型转换。
2. 不能把对象类型转换成不相关类的对象。
3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
4. 转换过程中可能导致溢出或损失精度，例如：

int i =128;
byte b = (byte)i;
因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。

5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：
(int)23.7 == 23;
(int)-45.89f == -45

 */
    public static void main(String[] args) {
        //必须满足转换前的数据类型的位数要低于转换后的数据类型，例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1); //97 c1 的值为字符 a ,查 ASCII 码表可知对应的 int 类型值为 97
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2); //66  A 对应值为 65，所以 i2=65+1=66
    }
}
