package qinshi.day13.final_03;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName FinalTest
 * @Date 2021/1/17 14:08
 */
public class FinalTest {
    /*
        final 修饰符，最终的
        可以修饰：除了构造方法以外的
        外部类
        内部类
        全局变量，一旦被final修饰，就变成全局常量，不能被修改
        一般与static连用

        final修饰的类不能被继承
        被final修饰的方法不能被重写
     */
    static final int age=19;

    void get(){
        final int a=1;
    }

    final void get2(){

    }

    final class B{

    }

    public FinalTest(){

    }
}

final class A{

}

class C{
    final void say(){

    }
}

class D extends C{  //被final修饰的方法不能被重写
//    @Override
//    void say() {
//        super.say();
//    }
public static void main(String[] args) {
    //final修饰对象，限定了对象名的值不能被修改
    final C c=new C();
    //c=new C();  //报错
}
}