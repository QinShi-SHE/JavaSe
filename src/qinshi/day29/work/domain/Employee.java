package qinshi.day29.work.domain;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Employee
 * @Date 2021/2/26 23:46
 */
public class Employee {
    //定义表中的字段，一般用包装类
    private Integer id;
    private String name;
    private Integer sex;

    public Employee(Integer id, String name, Integer sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getSex() {
        return sex;
    }
}
