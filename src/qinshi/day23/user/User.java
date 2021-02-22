package qinshi.day23.user;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName User
 * @Date 2021/1/31 9:44
 */
/*
这个类用于测试反射能否获取里面的属性、方法
 */
public class User {
    private String name;
    private int age;
    public char sex;
    public int a;
    public static int b;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void show(){
        System.out.println("show");
    }
    public void show(int a){
        System.out.println("show"+a);
    }
    private void show1(){
        System.out.println("show");
    }
    private void show1(int a){
        System.out.println("show1"+a);
    }
    public String print(){
        return "有返回值的方法";
    }
    public String print(String s){
        return "有参有反,传入的参数是:"+s;
    }
}
