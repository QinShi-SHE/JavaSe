package qinshi.day10.potting_1;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Account
 * @Date 2021/1/12 11:37
 */
public class Account {  //4，该类用public修饰
    /*
    封装步骤：
        必须的
        1. 私有化成员变量（用private修饰成员变量）
        2. 提供公共的方法，用于给每个成员变量属性赋值和取值：
            getXxx()方法
                获取成员变量的值，
                建议： 如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
            setXxx(...)方法
                设置成员变量的值

        不必须的
        3.	提供一个无参构造和全参构造
        4. 	该类用public修饰

     */

    //1. 私有化成员变量（用private修饰成员变量）
    private String name;
    private int age;
    private double moeny;
    private Boolean vip;

    //2 提供公共的方法
    public String getName() {
        return name;
    }

    public double getMoeny() {
        return moeny;
    }

    public Boolean isVip() {
        return vip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoeny(double moeny) {
        this.moeny = moeny;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断传入的年龄是否真实有效
        if(age<0||age>100){
            System.out.println("年龄无效！！");
        }else {
            this.age = age;
        }
    }

    public Account(String name, int age, double moeny, Boolean vip) {
        this.name = name;
        this.age = age;
        this.moeny = moeny;
        this.vip = vip;
    }

    //提供一个无参构造方法
    public Account() {
    }
}
