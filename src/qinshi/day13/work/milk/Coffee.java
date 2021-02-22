package qinshi.day13.work.milk;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Coffee
 * @Date 2021/1/17 17:19
 */
public class Coffee extends Water{
    public Coffee(String name, String taste) {
        super(name, taste);
    }

    @Override
    void drink() {
        System.out.println("喝咖啡");
    }
}
