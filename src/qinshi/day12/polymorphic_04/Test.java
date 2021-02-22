package qinshi.day12.polymorphic_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Test
 * @Date 2021/1/15 15:06
 */
public class Test {
    /*
        成员变量没有多态属性
        静态方法没有多态属性
     */
    public static void main(String[] args) {
        Father f=new Son();
        //获取熟悉的值
        System.out.println(f.x);  //父类的属性  1
        System.out.println(f.y);  //static修饰看父类   父类的属性 2
        //调用方法
        f.say();  //static修饰看父类  打印父类的say
        f.eat();  //打印子类的方法

        //在多态的情况下，子类调用自己独有的方法
        Father f2=new Son();
        //转换前，先判断
        if(f2 instanceof Son){
            Son s=(Son) f2;  //多态的向下转型
            s.playGirl();   //调用子类特有的方法
        }

        //java中没有兄弟关系
        //Son son=(Son) new Son2();  //错误的，平级不能强转
    }
}
