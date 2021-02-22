package qinshi.day11.extends_01;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ExtendsTest
 * @Date 2021/1/14 10:13
 */
public class ExtendsTest {
    /*
           子类可以继承父类哪些东西？
                    成员变量
                    公共的普通方法
           不能继承有哪些？
                    局部变量
                    构造方法
                        但是在创建子类对象时，
           总结：
                除了构造方法不能被继承其他都可以继承过来
                但是，私有化成员不能直接通过子类对象直接访问，但是可以通过继承过来的公共方法间接访问

           注意：
                子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。
                如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
                如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
     */
    public static void main(String[] args) {
        //创建子类对象
        E e=new E();  //调用父类的构造方法  子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。

        e.name="琴师"; //通过子类对象调用父类继承过来的普通成员变量
        e.getName(); //通过子类对象调用父类继承过来的公共的普通方法

        //e.age=23;  //不能通过子类对象调用父类的私有成员变量及私有方法

        e.setAge(23); //不能直接访问私有变量，但可以通过set,get间接继承
        System.out.println(e.getAge());

    }
}

class D{
    String name;
    private int age;

    void getName(){
        System.out.println(name);
    }

    public D(){
        System.out.println("这是A类无参构造方法");
    }

    public D(String str){
        System.out.println("这是A类的有参构造方法:"+str);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class E extends D{
    public E(){
        //如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
    }

    public E(String str){

    }
}