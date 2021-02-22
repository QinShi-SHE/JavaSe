package qinshi.day11.extends_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName SuperClass
 * @Date 2021/1/14 13:28
 */
public class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("父类  无参");
    }
    SuperClass(int n) {
        System.out.println("父类  有参");
        this.n = n;
    }
}

// SubClass 类继承
class SubClass extends SuperClass{
    private int n;

    SubClass(){    // 自动调用父类的无参数构造器 ，无参的子类构造方法，没写super也会自动调用父类无参构造方法
       //System.out.println("子类1  无参");
    }

    public SubClass(int n){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("子类1  有参:"+n);
        this.n = n;
    }
}
// SubClass2 类继承
class SubClass2 extends SuperClass{
    private int n;

    SubClass2(){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("子类2  无参");
    }

    public SubClass2(int n){ // 自动调用父类的有参数构造器
        System.out.println("子类2  有参:"+n);
        this.n = n;
    }
}

class TestSuperSub{
    public static void main (String args[]){
        System.out.println("------SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println();

        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}