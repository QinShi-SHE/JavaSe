package qinshi.day12.polymorphic_04;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Son
 * @Date 2021/1/15 15:06
 */
public class Son extends Father{
    int x=3;
    static int y=4;

    @Override
    void eat() {
        System.out.println("子类的eat");
    }
    static void say(){  //静态不重写
        System.out.println("父类的say");
    }

    //定义一个独有的方法
    void playGirl(){
        System.out.println("子类特有方法");
    }
}
