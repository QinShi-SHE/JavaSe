package qinshi.day13.work.milk;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Water
 * @Date 2021/1/17 17:16
 */
/*
编写程序描述咖啡、茶和啤酒
请使用面向对象的思想，设计自定义类，描述咖啡、茶和啤酒
参考分析思路：
第一步：分析咖啡、茶、啤酒的共性：
都是饮料
第二步：定义类饮料
属性：名称、口感
方法：饮用
第三步：定义咖啡、茶和啤酒分别继承饮料类
 */
public class Water {
    private String name;
    private String taste;

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    void drink(){

    }

    public Water(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
