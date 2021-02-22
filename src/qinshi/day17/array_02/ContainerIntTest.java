package qinshi.day17.array_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test2
 * @Date 2021/1/22 10:40
 */
public class ContainerIntTest {
    public static void main(String[] args) {
        ArrayContainerInt container= new ArrayContainerInt();
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        container.add(6);
        container.add(5);
        container.add(6);

        System.out.println(container.getIndex());  //打印数组中的个数
        System.out.println(container);  //重写了toString方法，打印对象，才不是地址值
    }
}
