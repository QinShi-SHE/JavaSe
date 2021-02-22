package qinshi.day10.potting_2;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName UserTest
 * @Date 2021/1/12 14:44
 */
public class User {
    /*
        this
            指代当前对象，即，哪个对象调用就指代哪个对象
            this.属性，是全局属性
        作用：
            1.解决成员变量与局部变量同名的问题
            2.本类中构造方法之间的相互调用，但是必须是构造方法内的第一句
                this() 调用无参构造方法
                this(根据参数的个数来决定调用哪个无参构造方法)
            3.作为返回值
            4.作为参数传递
                在static修饰的方法中，不能使用this
     */
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void userThis(){
        System.out.println(this);
    }

    //3 为返回值返回  ： this持有对象地址，表示该类的一个对象即是一个数据
    public User getUser(){
        return this;
    }

    public void test(){
        print(this);  //方法中调用方法   4.这里this作为参数传递
    }

    public void print(User user){
        System.out.println("对象的地址值："+user);
    }

    public User() {
    }

    public User(String name){
        /*
            调用当前类自己的构造方法，会根据参数自动匹配调用相应的
         */
        this(name,34);  //必须放在第一行
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
