package qinshi.day11.orride_02;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Animal
 * @Date 2021/1/14 11:06
 */
public class Animal {
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void move(){
        System.out.println(name+" 动物可以跑");
    }

    Object eat(){  //子类重写方法，修饰符权限：子类要大于等于父类； 返回值类型：子类要小于等于父类
        return "食物";
    }

    public void sleep(){
        System.out.println("父类的睡觉");
    }
}
