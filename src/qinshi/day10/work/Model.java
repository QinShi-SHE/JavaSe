package qinshi.day10.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Model
 * @Date 2021/1/12 14:32
 */
public class Model {
    /*
        定义一个Model类，里面有姓名、性别、年龄、胸围、腰围 字段，请使用标准封装+this进行测试；
        建议：写上this(...)的使用
     */
    String name;
    char sex;
    int age;
    double x;
    double y;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Model(){

    }

    public Model(String name) {
        this.name = name;
    }

    public Model(String name, char sex) {
        this(name);
        //this.name = name;
        this.sex = sex;
    }

    public Model(String name, char sex, int age) {
        this(name,sex);
//        this.name = name;
//        this.sex = sex;
        this.age = age;
    }

    public Model(String name, char sex, int age, double x) {
        this(name,sex,age); //this的第二种是用，在本类中调用构造方法，只能写在构造方法的第一句
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
        this.x = x;
    }

    public Model(String name, char sex, int age, double x, double y) {
        this(name,sex,age,x);  //this的第二种是用，在本类中调用构造方法，只能写在构造方法的第一句
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
