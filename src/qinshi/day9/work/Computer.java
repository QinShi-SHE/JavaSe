package qinshi.day9.work;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Computer
 * @Date 2021/1/11 16:52
 */
public class Computer {
    /*
        电脑类：属性：编号，单价，牌子，颜色
        方法1：显示该电脑信息：如 该电脑编号为XX，单价为XX
        方法2：可以玩游戏
        方法3：可以办公
     */

    long num;
    int price;
    String name;
    String color;

    String viewXX(){
        return "电脑编号："+num+" 单价："+price+" 品牌："+name+" 颜色："+color;
    }

    String playGame(){
        return " 可以玩游戏";
    }

    String office(){
        return " 可以办公";
    }

    public Computer() {
    }

    public Computer(long num, int price, String name, String color) {
        this.num = num;
        this.price = price;
        this.name = name;
        this.color = color;
    }
}
