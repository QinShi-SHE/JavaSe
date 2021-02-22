package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Person
 * @Date 2021/1/11 19:59
 */
public class Person {
    /*
   --创建一个类Person类，其中包括(姓名，性别，年龄),分别定义带三个参数的构造方法，
   两个参数的构造方法，显示指定默认无参的构造方法，并创建一个方法show打印姓名，性别和年龄信息，
   实例化三个对象分别调用三种不同的构造方法并打印三个对象的详细信息.
     */
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    void print(){
        System.out.println("姓名："+name+" 年龄："+age+" 性别："+sex);
    }

    public static void main(String[] args) {
        Person per1=new Person();
        Person per2=new Person("张三",'男');
        Person per3=new Person("李四",'女',35);

        per1.print();
        per2.print();
        per3.print();
    }
}
