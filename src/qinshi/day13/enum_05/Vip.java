package qinshi.day13.enum_05;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Vip
 * @Date 2021/1/17 16:03
 */
public enum Vip {
    //高级用法
    Vip1("贵族1"), //调用有参数的构造方法来创建枚举对象
    Vip2("贵族2"),
    Vip3("贵族3");

    private String name;


    //定义一个有参构造方法
    Vip(String name) {  //枚举默认构造方法修饰为private，不能用public
        this.name=name;
    }

    //要打印Vip1里的属性，要重写toString()方法
    @Override
    public String toString() {
        return name;
    }
}
