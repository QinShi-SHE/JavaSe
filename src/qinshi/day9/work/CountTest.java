package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName CountTest
 * @Date 2021/1/11 17:33
 */
public class CountTest {
    public static void main(String[] args) {
//        测试类(main):
//        传入1个数，然后调用计算类的方法1
//        传入俩个数，然后调用计算类的方法2，并且打印出较大数结果

        Count count=new Count();
        count.getValue(3);
        System.out.println("最大值是"+count.getValue(3,4));

        //main函数输入一个数，先后调用方法1和方法2，打印最终结果
        System.out.println(count.getInt(2));
        System.out.println(count.getInt2(2));
    }
}
