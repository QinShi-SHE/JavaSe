package qinshi.day19.map_01;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName ConcurrentHashMapTest
 * @Date 2021/1/25 11:28
 */
/*
ConcurrentHashMap  线程安全的
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap map=new ConcurrentHashMap();
        map.put(1,2);
        map.put(2,3);

        //替换，根据Key替换对应的value
        map.replace(1,3);
        System.out.println(map);
        //等效于
        map.put(1,4);
        System.out.println(map);

        //不能用null作为key value
        map.put(null,null);   //编译不报错，运行报错，空指针异常
    }
}
