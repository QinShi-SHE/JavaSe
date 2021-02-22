package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Student
 * @Date 2021/1/11 19:37
 */
public class Student {
    /*
        编写一个student类，其中包括(姓名，学号，班级，性别，年龄，家庭住址)和取得这些属性的方法，
        再增加一个sayHello()方法，用于输出学生的详细信息。
     */

    private String name;
    private long cid;
    private String cls;
    private char sex;
    private int age;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public long getCid() {
        return cid;
    }

    public String getCls() {
        return cls;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    void sayHello(){
        System.out.println("姓名："+name+"学号："+cid+"班级："+cls+"性别："+sex+"年龄："+age+"家庭住址："+address);
    }
}
