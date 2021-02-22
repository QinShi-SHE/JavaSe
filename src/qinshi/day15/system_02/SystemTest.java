package qinshi.day15.system_02;

import java.util.Arrays;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SystemTest
 * @Date 2021/1/20 10:24
 */
/*
System 类包含一些有用的类字段和方法。它不能被实例化。 即不能创建对象
在 System 类提供的设施中，有标准输入、标准输出和错误输出流；对外部定义的属性和环境变量的访问；加载文件和库的方法；还有快速复制数组的一部分的实用方法。

static PrintStream err
          “标准”错误输出流。
static InputStream in
          “标准”输入流。
static PrintStream out
          “标准”输出流。

static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
          从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
          src - 源数组。
        srcPos - 源数组中的起始位置。
        dest - 目标数组。
        destPos - 目标数据中的起始位置。
        length - 要复制的数组元素的数量

        If 如果 dest 为 null，则抛出 NullPointerException 异常。
        如果 src 为 null, 则抛出 NullPointerException 异常，并且不会修改目标数组。
        否则，只要下列任何情况为真，则抛出 ArrayStoreException 异常并且不会修改目标数组：
        src 参数指的是非数组对象。
        dest 参数指的是非数组对象。
        src 参数和 dest 参数指的是那些其组件类型为不同基本类型的数组。
        src 参数指的是具有基本组件类型的数组且 dest 参数指的是具有引用组件类型的数组。
        src 参数指的是具有引用组件类型的数组且 dest 参数指的是具有基本组件类型的数组。

        否则，只要下列任何情况为真，则抛出 IndexOutOfBoundsException 异常，并且不会修改目标数组：
        srcPos 参数为负。
        destPos 参数为负。
        length 参数为负。
        srcPos+length 大于 src.length，即源数组的长度。
        destPos+length 大于 dest.length，即目标数组的长度。

 */
public class SystemTest {
    public static void main(String[] args) {
        System.out.println("标准的输出流");
        System.err.println("标准的错误流");
        //接收键盘的输入
       // Scanner sc=new Scanner(System.in);
        //System.out.println("请输入");
        //接收整数
        //int i=sc.nextInt();
        //System.out.println(i);
        //接收字符串
        //String s=sc.next();
        //System.out.println(s);

        int[] src={1,2,3,4,5};
        int[] dest=new int[4];
        System.arraycopy(src,1,dest,1,3);
        System.out.println(Arrays.toString(dest));
    }
}
