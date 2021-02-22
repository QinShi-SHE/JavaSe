package qinshi.day22.model_5;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName HungrySingle
 * @Date 2021/1/30 15:24
 */
//饿汉
public class HungrySingle {
    //将构造方法私有化  就不能用new创建对象
    private HungrySingle(){}

    //定义一个私有化、终态的属性
    private static final HungrySingle hs=new HungrySingle();

    //提供给外部类使用的静态方法(方便使用类名.方法名调用)   用于创建对象
    public static HungrySingle getInstance(){
        return hs;
    }
}
