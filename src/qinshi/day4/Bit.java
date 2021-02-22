
package qinshi.day4;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Bit
 * @Date 2021/1/3 15:18
 */
public class Bit {
    public static void main(String[] args) {
        /*
                位运算符号：
		                &   |   ^   ~   <<  >>>   >>

                1. &  :与 位运算，两边为1，结果为1
                2. |  :或 位运算，有一个为1，结果为1
                3. ^ :  异或，两边不一样，就为1，否则为0
                4. ~ :  取反，1变成0  ,0 变成1    ~（-5）结果4
                5. << :  向左位移动，例如1<<3   结果8
                6. '>>':  向右位移动，例如8>>2
                7. '>>>':  无符号向右移动
         */
        System.out.println(77&13);
        System.out.println(77|13);
        System.out.println(6>>2);
        System.out.println(6<<2);
    }
}
