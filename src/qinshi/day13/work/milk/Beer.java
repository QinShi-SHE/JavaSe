package qinshi.day13.work.milk;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName Beer
 * @Date 2021/1/17 17:20
 */
public class Beer extends Water{


    public Beer(String name, String taste) {
        super(name, taste);
    }

    @Override
    void drink() {
        System.out.println("喝啤酒");
    }
}
