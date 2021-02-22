package qinshi.day11.abstract_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName AbstractTest
 * @Date 2021/1/14 14:17
 */
public abstract class AbstractTest {
    /*
          抽象类
                无法用语言描述的类就是一个抽象类，一般用于当模板
          抽象类可以写哪些
                属性：可以写但没必要
                方法：可以是普通方法和抽象方法
                构造方法：可以写，但是不能创建对象，不能实例化

          实例变量：没有static 修饰，通过对象名.变量名访问
          类变量：有static 修饰 通过类名l.变量名访问
     */

    public abstract void getArea();  //抽象方法，抽象类中的抽象方法必要要加abstract修饰（接口可以不用,默认有）

    public void getArea(int a){  //抽象类中的普通方法

    }
    public AbstractTest(){  //抽象类中的构造方法

    }

    public static void main(String[] args) {
        //AbstractTest abstractTest=new AbstractTest()  //抽象类不能被实例化
    }
}
