package qinshi.day19.collections_03;


import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author LiQin
 * @Version 1.o
 * @ClassName CollectionsTest
 * @Date 2021/1/25 16:21
 */
/*
集合工具类
    Collections

    static <T> boolean
        addAll(Collection<? super T> c, T... elements)
          将所有指定元素添加到指定 collection 中。 可以是list set map
 */
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList src=new ArrayList();
        Collections.addAll(src,1,3,5,6,745,4);
        System.out.println(src);
        System.out.println(Collections.max(src)); //找集合中最大值，必须是同一类型

        ArrayList newarr=new ArrayList();
        Collections.addAll(newarr,null,null,null,null,null,null);
        Collections.fill(newarr,1);
        System.out.println(newarr);
        Collections.copy(src,newarr);  //将newarr复制给src
        System.out.println(src);

//        Collections.reverse(src);
//        System.out.println(src);
    }
}
