package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName PersonCreate
 * @Date 2021/1/17 14:03
 */
public class PersonCreate {
    /*
    定义一个PersonCreate类：
创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
分别调用对象的sayHello()方法。
     */
    public static void main(String[] args) {
        Person p1=new Person("zhangsan",1.73,33);
        Person p2=new Person("lishi",1.74,44);
        p1.sayHello();
        p2.sayHello();
    }
}
