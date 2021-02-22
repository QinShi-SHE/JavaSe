package qinshi.day9;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Animal
 * @Date 2021/1/11 15:28
 */
public class Animal {
    /*
            构造方法的语法：
                   类名（）{
                   }
            注意：
                没有返回值类型,不能有void
                普通方法不要与类名一致
                如果类中一旦写了显示的构造方法，那么默认的无参构造方法就失效了，要用调用无参构造方法，就必须定义一个
                如果类中没有显示的构造方法，那么会存在隐式的无参构造方法
                构造方法不能有任何非访问性质的修饰符修饰，例如 static、final、synchronized、abstract等都不能修饰构造方法。
     */

    String name;
    int age;
    char sex;

    //创建一个无参构造方法
    public Animal(){
        System.out.println("构造方法");  //写了打印语句，用new Animal()会打印这句话
    }

    //有参构造方法  构造方法的重载
    public Animal(String name){
        System.out.println("构造方法"+name);
    }

    //提供一个有参数的构造方法，用于给属性赋值   构造方法的重载
    public Animal(String name,int age,char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void Animal(){  //这是一个普通方法
        System.out.println("这是一个和类名相同的普通方法");
    }
}
