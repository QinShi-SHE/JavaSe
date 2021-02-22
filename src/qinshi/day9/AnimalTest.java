package qinshi.day9;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName StudentTest2
 * @Date 2021/1/11 15:25
 */
public class AnimalTest {
    /*
            构造方法：
                作用：用于创建对象
            new做两件事
                1.在堆中开辟一块内存空间用于存放类的属性和方法
                2.调用构造方法来创建对象
     */
    public static void main(String[] args) {
        Animal animal=new Animal();  //无参构造

        animal.Animal(); //调用和类名相同的普通方法
        System.out.println();

        Animal animal1=new Animal("有参");  //有参构造
        System.out.println();

        //一种赋值方式，先创建对象，在赋值
        animal.name="小白";
        System.out.println(animal.name);

        //创建对象的时候同时赋值
        Animal animal2=new Animal("篱琴",22,'男');  //必须提供这个相应 类型 及 个数 相同的有参构造方法
        System.out.println(animal2.name);
    }
}
