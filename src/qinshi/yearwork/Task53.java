package qinshi.yearwork;

import org.junit.Test;

/**
 * @Author 22817
 * @Version 1.o
 * @ClassName Task53
 * @Date 2021/2/19 23:13
 */
/*雄联盟中有这么一些分类
TANK (坦克)
WIZARD (法师 )
ASSASSIN (刺客)
ASSIST (辅助)
WARRIOR (近战)
RANGED (远程 )
PUSH (推进)
FARMING (打野)
设计一个枚举类型HeroType,使用上述分类作为常量

再编写一段switch语句，把每种枚举常量输出为中文字符串
*/
public class Task53 {
    @Test
    public void test() throws Exception{
        switch (HeroType.FARMING){
            case TANK:
                System.out.println(HeroType.TANK);break;
            case WIZARD:
                System.out.println(HeroType.WIZARD);break;
            case ASSASSIN:
                System.out.println(HeroType.ASSASSIN);break;
            case ASSIST:
                System.out.println(HeroType.ASSIST);break;
            case WARRIOR:
                System.out.println(HeroType.WIZARD);break;
            case RANGED:
                System.out.println(HeroType.RANGED);break;
            case PUSH:
                System.out.println(HeroType.PUSH);break;
            case FARMING:
                System.out.println(HeroType.FARMING);break;
        }
    }
}

enum HeroType{
    //调用有参数的构造方法来创建枚举对象
    TANK("坦克"),
    WIZARD("法师"),
    ASSASSIN("刺客"),
    ASSIST("辅助"),
    WARRIOR("近战"),
    RANGED("远程"),
    PUSH("推进"),
    FARMING("打野");

    private String name;

    //定义一个有参构造方法
    HeroType(String name){
        this.name=name;
    }

    //要打印参数里的属性值，要重写toString()方法
    @Override
    public String toString() {
        return name;
    }
}
