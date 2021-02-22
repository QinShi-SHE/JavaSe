package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName People
 * @Date 2021/1/11 18:08
 */
public class People {
    /*
            （1）创建一个叫做People的类：
            属性：姓名、年龄、性别、身高
            行为：说话、计算加法、改名
            编写能为所有属性赋值的构造方法；
     */

    private String name;
    private int age;
    private char sex;
    private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    String say(){
        return "你好！";
    }

    int count(int a,int b){
        return a+b;
    }

    void changeName(String name){
        this.name=name;
    }

    public People(String name, int age, char sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }
}
