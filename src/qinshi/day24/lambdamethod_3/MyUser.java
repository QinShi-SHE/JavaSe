package qinshi.day24.lambdamethod_3;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName MyUser
 * @Date 2021/2/2 14:40
 */
public class MyUser {
    String name;

    public MyUser(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyUser [name=" + name + "]";
    }
}

