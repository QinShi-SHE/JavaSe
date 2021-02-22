package qinshi.day12.interface_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Animal
 * @Date 2021/1/15 14:09
 */
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
