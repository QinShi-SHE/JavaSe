package qinshi.day13.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName book
 * @Date 2021/1/17 13:53
 */
/*
定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；输出笔记本信息的方法，然后编写一个测试类，测试笔记本类的各个方法。
 */
public class Book {
    private char color;
    private int cpu;

    public Book() {
    }

    public Book(char color, int cpu) {
        this.color = color;
        this.cpu = cpu;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public char getColor() {
        return color;
    }

    public int getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Book{" +
                "color=" + color +
                ", cpu=" + cpu +
                '}';
    }
}
