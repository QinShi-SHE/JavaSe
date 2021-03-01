package qinshi.day30.domain;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Student
 * @Date 2021/2/27 9:18
 */
public class Student {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String intro;
    private String sex;

    public Student(){}
    public Student(Integer id, String username, String password, Integer age, String intro, String sex) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.intro = intro;
        this.sex = sex;
    }

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", intro='" + intro + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public String getIntro() {
        return intro;
    }

    public String getSex() {
        return sex;
    }
}
