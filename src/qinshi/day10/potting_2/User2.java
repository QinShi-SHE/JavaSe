package qinshi.day10.potting_2;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName User2
 * @Date 2021/1/12 15:17
 */
public class User2 {
    String name;
    char sex;
    int age;

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
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

    public User2(){}

    public User2(String name) {
        this.name = name;
    }

    public User2(String name, char sex) {
        this(name);  //this的第二种是用，在本类中调用构造方法，只能写在构造方法的第一句
        //this.name = name;
        this.sex = sex;
    }

    public User2(String name, char sex, int age) {
        this(name,sex);  //this的第二种是用，在本类中调用构造方法，只能写在构造方法的第一句
        //this.name = name;
        //this.sex = sex;
        this.age = age;
    }

    //普通方法将this当做返回值使用
    public User2 getUer(){
        return this;
    }
}
