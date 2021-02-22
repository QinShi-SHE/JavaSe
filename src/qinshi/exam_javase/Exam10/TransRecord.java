package qinshi.exam_javase.Exam10;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName TransRecord
 * @Date 2021/2/3 13:38
 */
public class TransRecord implements Comparable {   //6.1.设计一个交易记录类TransRecord (金额字段数据类型定为double)。
    private String id;           //账单id
    private String name;        //姓名
    private String sex;        //性别
    private int age;          //年龄
    private String type;     //消费类型
    private String date;    //消费时间
    private double money;  //消费金额

    public TransRecord() {
    }

    public TransRecord(String id, String name, String sex, int age, String type, String date, double money) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.type = type;
        this.date = date;
        this.money = money;
    }

    @Override
    public String toString() {
        return "TransRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", money=" + money +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public double getMoney() {
        return money;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //元素类型实现Comparable接口，重写CompareTo方法
    @Override
    public int compareTo(Object o) {
        TransRecord transRecord=null;
        if (o instanceof TransRecord){  //判断是否是TransRecord
            transRecord=(TransRecord) o;
        }
        return (int)(this.getMoney()-transRecord.getMoney());  ////返回值的含义:如果是0表示两个对象相同，如果是负数，从大到小排序，如果是正数从小到大
    }
}
