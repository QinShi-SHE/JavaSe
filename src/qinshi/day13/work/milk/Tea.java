package qinshi.day13.work.milk;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Tea
 * @Date 2021/1/17 17:20
 */
public class Tea extends Water{
    public Tea(String name, String taste) {
        super(name, taste);
    }

    @Override
    void drink() {
        System.out.println("喝茶");
    }
}
