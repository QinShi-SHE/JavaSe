package qinshi.day13.enum_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Student
 * @Date 2021/1/17 15:55
 */
public class Student {
    private String name;
    private int age;
    private String vip;

    public Student(String name, int age, String vip) {
        this.name = name;
        this.age = age;
        this.vip = vip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getVip() {
        return vip;
    }
}
