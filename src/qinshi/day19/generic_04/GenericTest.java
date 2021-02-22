package qinshi.day19.generic_04;

import java.util.ArrayList;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName GenericTest
 * @Date 2021/1/25 16:37
 */

public class GenericTest {
    public static void main(String[] args) {
        //ArrayList list=new ArrayList();
        ArrayList<User> list=new ArrayList<User>();
        list.add(new User());
        //list.add(new Dog());
        System.out.println(list);
    }
}
