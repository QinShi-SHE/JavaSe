package qinshi.yearwork;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task42
 * @Date 2021/2/19 19:19
 */
/*单例模式3种实现方式*/
public class Task42 {

}

//懒汉式 被动创建
class A{
    private A(){};  //1.构造方法私有化
    private static A a=null; //2.定义一个私有化的对象
    public static A getA(){   //3.定一个静态的公共方法
        if(a==null)  //判断对象是否存在，就创建对象
            a=new A();
        return a;
    }
}
//饿汉 主动创建
class B{
    private B(){};  //1.构造方法私有化
    private final static B b=new B();  //2.定义一个终态，私有的对象并创建
    public static B getB(){ //3.定一个静态的公共方法
        return b;
    }
}
//枚举
enum Singleton{
    INSTANCE;
}